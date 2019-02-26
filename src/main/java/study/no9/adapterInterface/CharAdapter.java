package study.no9.adapterInterface;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class CharAdapter extends CharaterUtil implements Readable {
	private int count;
	
	public CharAdapter(int count){
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count--==0){return -1;}
		char [] charArr = getCharArr("  ≈‰ƒ£ Ω");
		for(char c:charArr){
			cb.put(c);
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new CharAdapter(1));
		while(s.hasNext()){
			System.out.println(s.next());
		}
		
	}

}

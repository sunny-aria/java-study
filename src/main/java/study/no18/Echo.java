package study.no18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {
	
	public static void read() throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=stdin.readLine())!=null && s.length()!=0){
			System.out.println(s);
		}
		stdin.close();
	}
	public static void read1()throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s=stdin.readLine())!=null && s.length()!=0){
			System.out.println(s);
			sb.append(s);
		}
		stdin.close();
		String readStr = TextFile.read(sb.toString()).toUpperCase();//"d:/workspace/study/src/study/no18/Echo.java"
		System.out.println(readStr);
	}
	public static void main(String[] args) throws IOException {
//		read();
		read1();
	}

}

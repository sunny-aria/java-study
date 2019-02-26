package study.no15.practice;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	public void add(T item){
		storage.add(item);
	}
	public T select(){
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		RandomList<Integer> ra = new RandomList<Integer>();
		RandomList<Character> rb = new RandomList<Character>();
		int[] arra={1,2,3,4,5};
		char[] arrb={"a".charAt(0),"b".charAt(0),"c".charAt(0),"d".charAt(0)};
		for(int a:arra){
			ra.add(a);
		}
		for(char b:arrb){
			rb.add(b);
		}
		for(int i=0;i<10;i++){
			System.out.print(ra.select());
		}
		System.out.println();
		for(int j=0;j<10;j++){
			System.out.print(rb.select());
		}
	}

}

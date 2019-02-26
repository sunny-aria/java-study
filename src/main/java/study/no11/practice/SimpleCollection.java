package study.no11.practice;

import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {

	public static void main(String[] args) {
		
		Collection<Integer> c = new HashSet<Integer>();
		for(int i=0;i<10;i++){
			c.add(i);
		}
		for(int i:c){
			System.out.print(i+",");
		}
	}

}

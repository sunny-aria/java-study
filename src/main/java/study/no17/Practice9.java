package study.no17;

import java.util.TreeSet;

import study.no15.practice.Generator;
import study.no16.RandomGenerator;

public class Practice9 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		Generator<String> gen = new RandomGenerator.String();
		for(int i=0;i<10;i++){
			set.add(gen.next());
		}
		System.out.println(set);
	}

}

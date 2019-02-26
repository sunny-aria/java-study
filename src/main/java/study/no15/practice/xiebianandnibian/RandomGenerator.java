package study.no15.practice.xiebianandnibian;

import java.util.Random;

import study.no15.practice.Generator;

public class RandomGenerator {
	Random rand = new Random(47);


	Generator<String> String(int size){
		return new Generator<String>() {

			@Override
			public String next() {
				
				return rand.nextInt(size)+"abcde";
			}
			
		};
	}
	Generator<Integer> Integer(){
		return new Generator<Integer>() {

			@Override
			public java.lang.Integer next() {
				
				return rand.nextInt(10000);
			}
		};
	}
}

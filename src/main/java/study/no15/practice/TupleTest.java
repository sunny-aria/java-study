package study.no15.practice;

import study.no15.practice.story.StoryCharacters;
import study.no15.practice.story.StoryGenerator;

public class TupleTest {  
	static Practice1<String> f(){
		return Tuple.tuple("sunny");
	}
	static Practice1 f2(){
		return Tuple.tuple(47);
	}
	static <T>void f(Practice1<T> p){
		System.out.println(p);
	}
	
	static Practice3<String, StoryCharacters, Integer,String, Short, String> g(){
		return Tuple.tuple("sunny", new StoryGenerator().next(), 1, "test",(short)2, "test1");
	}
	public static void main(String[] args) {
		Practice1<String> p1 = f();
		System.out.println(p1);
		System.out.println(f2());
		f(f2());
		System.out.println(g());
	}
}

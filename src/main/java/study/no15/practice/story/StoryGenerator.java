package study.no15.practice.story;

import java.util.Iterator;
import java.util.Random;

import study.no15.practice.Generator;
/**
 * 泛型可用于接口，例如：生成器，这是一种专门负责创建对象的类，这是工厂设计模式的一种应用。
 * StoryGenerator.java
 * @author sunny
 * 2016年12月13日上午8:00:32
 */
public class StoryGenerator implements Generator<StoryCharacters>,Iterable<StoryCharacters> {
	private int size=0;
	private Class[] types = {GoodGuys.class,BadGuys.class,OtherGuys.class};
	private static Random rand = new Random(47);
	
	public StoryGenerator() {
		super();
	}
	public StoryGenerator(int size) {
		super();
		this.size = size;
	}



	@Override
	public StoryCharacters next() {
		
		try {
			return (StoryCharacters) types[rand.nextInt(types.length)].newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	class StoryIterator implements Iterator<StoryCharacters>{
		int count = size;

		@Override
		public boolean hasNext() {
			
			return count>0;
		}

		@Override
		public StoryCharacters next() {
			count--;
			return StoryGenerator.this.next();
		}
		
	}
	
	
	@Override
	public Iterator<StoryCharacters> iterator() {//可以使用foreach 循环
		
		//return new StoryIterator(); //2种内部类实现方式
		return new Iterator<StoryCharacters>(){
			int count = size;

			@Override
			public boolean hasNext() {
				
				return count>0;
			}

			@Override
			public StoryCharacters next() {
				count--;
				return StoryGenerator.this.next();
			}
			
		};
	}
	public static void main(String[] args) {
		StoryGenerator gen = new StoryGenerator();
		
		for(int i=0;i<5;i++){//可以单纯的调用for循环创建
			System.out.println(gen.next());
		}
		
		for(StoryCharacters s:new StoryGenerator(5)){//也可以调用实现了Iterator接口的方法使用foreach 
			System.out.println(s);
		}
	}
}

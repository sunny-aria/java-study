package study.no15.practice.inner;

import study.no15.practice.Generator;

/**
 * 小鱼
 * LittleFish.java
 * @author sunny
 * 2016年12月15日上午7:56:46
 */
public class LittleFish {
	private static long counter=1;
	private final long id=counter++;
	private LittleFish(){}
	
	public String toString(){return "littleFish "+id;}
	//single generator
	//使用属性
	public static Generator<LittleFish> generator = new Generator<LittleFish>() {
		@Override
		public LittleFish next() {
			return new LittleFish();
		}
	};
}

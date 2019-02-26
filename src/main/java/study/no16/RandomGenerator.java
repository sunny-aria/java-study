package study.no16;

import java.util.Random;

import study.no15.practice.Generator;
import study.no16.CountingGenerator;

/**
 * 使用随机数生成器
 * RandomGenerator.java
 * @author sunny
 * 2017年1月19日上午7:51:03
 */
public class RandomGenerator {
	private static Random r = new Random(47);
	public static class Boolean implements Generator<java.lang.Boolean>{
		@Override
		public java.lang.Boolean next() {
			return r.nextBoolean();
		}
	}
	
	public static class Byte implements Generator<java.lang.Byte>{
		@Override
		public java.lang.Byte next() {
			return (byte) r.nextInt();
		}
	}
	
	public static class Character implements Generator<java.lang.Character>{
		@Override
		public java.lang.Character next() {
			return CountingGenerator.chars[r.nextInt(CountingGenerator.chars.length)];
		}
	}
	
	public static class String extends CountingGenerator.String{
		{ cg = new Character();}
		public String(){}
		public String(int length){super(length);}
	}
	
	public static class Integer implements Generator<java.lang.Integer>{
		private int mod = 10000;
		public Integer(){}
		public Integer(int modulo){ mod = modulo;}
		@Override
		public java.lang.Integer next() {
			return r.nextInt(mod);
		}
	}
	
	
}

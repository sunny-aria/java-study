package study.no16;

import study.no15.practice.Generator;

public class CountingGenerator {
	/**
	 * double 生成器
	 * CountingGenerator.java
	 * @author sunny
	 * 2017年1月16日上午8:30:21
	 */
	public static class Double implements Generator<java.lang.Double>{
		private double value=0.0;
		@Override
		public java.lang.Double next() {
			double result = value;
			value+=1.0;
			return result;
		}
	}
	public static char[] chars = ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
	public static class Character implements Generator<java.lang.Character>{
		int index=-1;
		@Override
		public java.lang.Character next() {
			index = (index+1)%chars.length;
			return chars[index];
		}
		
	}
	public static class String implements Generator<java.lang.String>{
		private int length=7;
		protected Generator<java.lang.Character> cg = new Character();
		public String(){}
		public String(int length){this.length=length;}
		@Override
		public java.lang.String next() {
			char[] buf = new char[length];
			for(int i=0;i<length;i++){
				buf[i]=cg.next();
			}
			return new java.lang.String(buf);
		}
		
	}
	
}

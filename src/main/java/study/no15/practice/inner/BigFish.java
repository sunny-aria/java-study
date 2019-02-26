package study.no15.practice.inner;

import study.no15.practice.Generator;

/**
 * 大鱼
 * BigFich.java
 * @author sunny
 * 2016年12月15日上午7:51:44
 */
public class BigFish {
	private static int counter=1;
	private final int id=counter++;
	private BigFish(){}
	public String toString(){ return "bigFich "+id;}
	/**
	 * 使用方法
	 * @return
	 */
	public static Generator<BigFish> generator(){
		return new Generator<BigFish>(){
			@Override
			public BigFish next() {
				return new BigFish();
			}
		};
	}
}

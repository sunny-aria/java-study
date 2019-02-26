package study.no15.practice;

import java.util.Iterator;
/**
 * 使用组合 ，适配器模式，实现斐波那契数列，
 * 实现Iterable 接口，实现Iterator() 方法，返回一个Iterator 匿名内部类
 * IterableFibonacci.java
 * @author sunny
 * 2016年12月13日上午7:37:51
 */
public class IterableFibonacci implements Iterable<Integer> {
	private int n;
	private Fibonacci fibo=new Fibonacci();
	public IterableFibonacci(int count){ n=count;}
	
	@Override
	public Iterator<Integer> iterator() {
		
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				
				return n>0;
			}

			@Override
			public Integer next() {
				n--;
				return fibo.next();
			}
		};
	}

public static void main(String[] args) {
	for(int i:new IterableFibonacci(18)){
		System.out.print(i+" ");
	}
}
}

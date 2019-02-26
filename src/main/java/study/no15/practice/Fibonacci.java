package study.no15.practice;
/**
 * 斐波那契数列，实现方法
 * Fibonacci.java
 * @author sunny
 * 2016年12月12日上午8:30:53
 */
public class Fibonacci implements Generator<Integer> {
	private int count = 0;
	public Integer next(){return fib(count++);}
	private int fib(int i) {
		if(i<2) return 1;
		return fib(i-2)+fib(i-1);
	}
}

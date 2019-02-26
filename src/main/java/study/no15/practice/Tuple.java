package study.no15.practice;
/**
 * 元组类，简化元组类的使用
 * Tuple.java
 * @author sunny
 * 2016年12月14日上午8:34:20
 */
public class Tuple {
	public static <A> Practice1<A> tuple(A a){
		return new Practice1<A>(a);
	}
	
	public static <A,B,C,D,E,F> Practice3<A, B, C, D, E, F> tuple(A a,B b,C c,D d,E e,F f){
		return new Practice3<A, B, C, D, E, F>(a, b, c, d, e, f);
	}
}

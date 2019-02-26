package study.no20;

import java.util.LinkedList;

/**
 * 模拟堆栈
 * StackL.java
 * @author sunny
 * 2017年4月12日上午7:36:41
 * @param <T>
 */
public class StackL<T> {
	private LinkedList<T> list = new LinkedList<T>();
	public void push(T v){list.addFirst(v);}
	public T top(){return list.getFirst();}
	public T pop(){return list.removeFirst();}
}

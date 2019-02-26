package study.no11.practice;

import java.util.LinkedList;

/**
 * z自定义栈
 * StackVo.java
 * @author sunny
 * 2016年11月4日上午8:18:45
 */
public class StackVo<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v){storage.addFirst(v);}
	public T peek(){return storage.getFirst();}
	public T pop(){return storage.removeFirst();}
	public boolean empty(){return storage.isEmpty();}
	public String toString(){return storage.toString();}
}

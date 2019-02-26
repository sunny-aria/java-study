package study.no15.practice.practice41;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * 实现iterable接口
 * SimpleQueue.java
 * @author sunny
 * 2017年1月6日上午9:02:28
 * @param <T>
 */
public class SimpleQueue<T> implements Iterable<T> {
	private LinkedList<T> list = new LinkedList<T>();
	public void add(T t){list.offer(t);}
	public T get(){return list.poll();}
	
	@Override
	public Iterator<T> iterator() {
		
		return list.iterator();
	}

}

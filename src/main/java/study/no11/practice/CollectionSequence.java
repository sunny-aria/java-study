package study.no11.practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/**
 * 实现Collection 接口，实现的方法比较多，也可以继承AbstractCollection 类，实现的方法较少
 * 要实现Collection，就必须要实现iterator(),并且只拿实现Iterator与继承AbstractCollection相比，花费的
 * 代价只有略微减少。但是当你的类已经继承了其他的类，那么就不能再继承AbstractCollection了。这种情况下，
 * 要实现Collection，就必须实现该接口的所有方法。
 * CollectionSequence.java
 * @author sunny
 * 2016年11月7日上午8:00:29
 */
public class CollectionSequence implements Collection<String> {
	private List<String> list =null;
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.size()<1;
	}

	@Override
	public boolean contains(Object o) {
		return list.contains(o);
	}

	@Override
	public Iterator<String> iterator() {
		return list.iterator();
	}

	@Override
	public Object[] toArray() {
		return list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return list.toArray(a);
	}

	@Override
	public boolean add(String e) {
		return list.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return list.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		return list.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return list.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return list.retainAll(c);
	}

	@Override
	public void clear() {
		list.clear();
	}

}

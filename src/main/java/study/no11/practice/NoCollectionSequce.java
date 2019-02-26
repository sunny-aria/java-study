package study.no11.practice;

import java.util.Iterator;

/**
 * 生成Iterator 是耦合最小的方式
 * NoCollectionSequce.java
 * @author sunny
 * 2016年11月7日上午8:35:56
 */
public class NoCollectionSequce {
	private String[] arrs = {"a","b","c","d"};
	public Iterator<String> iterator(){
		return new Iterator<String>() {
			private int index =0;
			@Override
			public boolean hasNext() {
				return index<arrs.length;
			}

			@Override
			public String next() {
				return arrs[index++];
			}
		};
	}
	
	//实现Iterable ,实现反转，
	//当你有一个排序方法接口时，还需要另外一个接口，可以使用适配器模式，此处添加一个产生Iterable对象的方法，该对象可用于foreach语句。
	public Iterable<String> reverse(){
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				return new Iterator<String>() {
					private int index = arrs.length-1;
					@Override
					public boolean hasNext() {
						return index>-1;
					}

					@Override
					public String next() {
						return arrs[index--];
					}
				};
			}
		};
	}
	
	public static void main(String[] args) {
		NoCollectionSequce ncs = new NoCollectionSequce();
		InterfaceVsIterator.display(ncs.iterator());
		InterfaceVsIterator.display(ncs.reverse().iterator());
	}
}

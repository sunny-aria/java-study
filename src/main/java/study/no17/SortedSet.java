package study.no17;

import java.util.Comparator;
import java.util.LinkedList;

import study.no15.practice.Generator;
import study.no16.RandomGenerator;

public class SortedSet<T> implements Comparator<T>{
	private LinkedList<T> list = new LinkedList<T>();

	@Override
	public int compare(T o1, T o2) {
		return o1.hashCode()>o2.hashCode()?-1:(o1.hashCode()==o2.hashCode()?0:1);
	}
	
	public void add(T t){
		list.add(t);
	}
	
	public T first(){
		return list.getFirst();
	}
	
	public T last(){
		return list.getLast();
	}
	public static void main(String[] args) {
		SortedSet<String> set = new SortedSet<String>();
		Generator<String> gen = new RandomGenerator.String();
		for(int i=0;i<10;i++){
			set.add(gen.next());
		}
		System.out.println(set.list);
		System.out.println(set.first());
		System.out.println(set.last());
	}
	
	
}

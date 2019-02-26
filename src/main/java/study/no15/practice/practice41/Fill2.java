package study.no15.practice.practice41;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import study.no15.practice.Generator;

/**
 * 用适配器仿真潜在类型机制
 * Fill2.java
 * @author sunny
 * 2017年1月6日上午8:46:49
 */
public class Fill2 {
	
	public static <T> void  fill(Addable<T> addable,Class<? extends T> classToken,int size){
		for(int i=0;i<size;i++){
			try {
				addable.add(classToken.newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static <T> void fill(Addable<T> addable,Generator<T> generator,int size){
		for(int i=0;i<size;i++){
			addable.add(generator.next());
		}
	}
	
	public static void main(String[] args) {
		List<Coffee> carrier = new ArrayList<Coffee>();
		Fill2.fill(new AddableCollectionAdapter(carrier), Coffee.class, 3);
		Fill2.fill(Adapter.collectionAdapter(carrier), Latte.class, 2);
		for(Coffee c: carrier){
			System.out.println(c);
		}
		System.out.println("-------------");
		AddableSimpleQueue<Coffee> cq = new AddableSimpleQueue<Coffee>();
		Fill2.fill(cq, Mocha.class	, 3);
		Fill2.fill(cq,Latte.class	, 2);
		for(Coffee c:cq){
			System.out.println(c);
		}
	}

}
interface Addable<T>{void add(T t);}
//使用组合
class AddableCollectionAdapter<T> implements Addable<T>{
	private Collection<T> c;
	
	public AddableCollectionAdapter(Collection<T> c) {
		super();
		this.c = c;
	}

	@Override
	public void add(T t) {
		c.add(t);
	}
	
}
//适配器
class Adapter{
	public static  <T> Addable<T> collectionAdapter(Collection<T> c){
		return new AddableCollectionAdapter(c);
	}
}

//使用继承
class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T>{

	@Override
	public void add(T t) {
		super.add(t);
	}
}


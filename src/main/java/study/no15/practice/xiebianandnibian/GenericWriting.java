package study.no15.practice.xiebianandnibian;

import java.util.ArrayList;
import java.util.List;

/**
 * 超类型边界
 * GenericWriting.java
 * @author sunny
 * 2016年12月27日上午8:19:08
 */
public class GenericWriting {
	/**
	 * 
	 * @param list
	 * @param item
	 */
	static  <T> void writeExact(List<T> list,T item){
		list.add(item);
	}
	//使用确切类型的好处是，可以用泛型来做更多的事，例如，想要从泛型参数返回类型确定的返回值
	static <T> T exact1(Holder<T> holder,T arg){
		holder.set(arg);
		T t = holder.get();
		return t;
	}
	
	static List<Apple> apples = new ArrayList<Apple>();
	static List<Fruit> fruit = new ArrayList<Fruit>();
	
	static void f1(){
		writeExact(apples, new Apple());
		writeExact(fruit, new Apple());
	}
	
	static <T> void writeWithWildcard(List<? super T>list,T item){
		list.add(item);
	}
	
	static void f2(){
		writeWithWildcard(apples, new Apple());
		writeWithWildcard(fruit, new Apple());//当传入fruit list时，？super Fruit 转变为Fruit 的导出类
		
	}
	public static void main(String[] args) {

	}

}

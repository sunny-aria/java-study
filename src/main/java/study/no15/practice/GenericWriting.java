package study.no15.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * 超类型边界
 * GenericWriting.java
 * @author sunny
 * 2016年12月22日上午8:12:32
 */
public class GenericWriting {
	static<T> void writeExact(List<T> list,T item){
		list.add(item);
	}
	static List<Apple> apples =new ArrayList<Apple>();
	static List<Fruit> fruit = new ArrayList<Fruit>();
	
	static void f1(){
		writeExact(apples, new Apple());
		writeExact(fruit, new Apple());//可以这样做
		System.out.println(apples);
		System.out.println(fruit);
	}
	
	static<T> void writeWithWildCard(List<? super T> list,T item){
		list.add(item);
	}
	
	static void f2(){
		writeWithWildCard(apples,new Apple());
		writeWithWildCard(fruit,new Apple());
		System.out.println(apples);
		System.out.println(fruit);
	}
	
	public static void main(String[] args) {
		f1();f2();
	}

}
class Fruit{}
class Apple extends Fruit{}
class Apple1 extends Apple{}
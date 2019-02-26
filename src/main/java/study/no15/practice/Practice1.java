package study.no15.practice;

import study.no14.practice.typinfo.Pet;
/**
 * //暂不指定类型，稍后再决定具体使用说明类型，可以存入该类型或其子类，多态和泛型不冲突
 * Practice1.java
 * @author sunny
 * 2016年12月8日上午8:26:26
 * @param <T>
 */
public class Practice1<T> {
	private T a;
	public Practice1(T a){
		this.a=a;
	}
	public void set(T a){
		this.a=a;
	}
	public T get(){return a;}
	
	public static void main(String[] args) {
		Practice1<Pet> p1 = new Practice1<Pet>(new Dog());
		Practice1<Pet> p2 = new Practice1<Pet>(new Pet());
		p1.get().toString();
		System.out.println(p2.get());
	}
}
class Dog extends Pet{
	Dog(){
		System.out.println("dog.");
	}
}
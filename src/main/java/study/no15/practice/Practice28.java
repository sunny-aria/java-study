package study.no15.practice;

import java.util.List;

/**
 * 泛型协变 ，逆变,此示例有误，主要是协变，逆变的写法
 * Practice28.java
 * @author sunny
 * 2016年12月23日上午8:08:58
 */
public class Practice28 {
	
	 void f(List<? super Apple> t){
		Generatic1<Fruit> g = new Generatic1<Fruit>();
//		g.f(t);
	}
	void g(List<? extends Apple> t){
		Generatic2<Apple> g = new Generatic2<Apple>();
		g.f(t);
	}
	
	public static void main(String[] args) {

	}

}
class Generatic1<T>{
	 void f(List<T> t){
		System.out.println(t.get(0));
	} 
}
class Generatic2<Apple>{
	
	  Apple f(List<? extends study.no15.practice.Apple> t){
		return (Apple) t.get(0);
	}
}
package study.no15.practice;

import study.no14.practice.typinfo.Pet;

/**
 * 一次方法调用返回多个不同类型的对象，元组(tuple)，它是将一组对象直接打包存储于其中一个单一对象，
 * 这个容器允许读取其中元素，但是不允许向其中存放新的对象（俗称信使）
 * Practice3.java
 * @author sunny
 * 2016年12月9日上午7:42:09
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 * @param <E>
 * @param <F>
 */
public class Practice3<A,B,C,D,E,F> {
	public final A a;
	public final B b;
	public final C c;
	public final D d;
	public final E e;
	public final F f;
	
	public Practice3(A a, B b, C c, D d, E e, F f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}


	@Override
	public String toString() {
		return "Practice3 [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + "]";
	}

	/**
	 * 泛型的具体用法，使用的时候传入具体的类型
	 * @return
	 */
	public static Practice3<Pet,Dog,String,Integer,Long,Short> getP(){
		return new Practice3<Pet,Dog,String,Integer,Long,Short>(new Pet(),new Dog(),"sunny",1,2l,(short)3);
	}

	public static void main(String[] args) {
		System.out.println(getP());
	}

}

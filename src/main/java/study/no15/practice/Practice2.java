package study.no15.practice;
/**
 * 泛型的主要目的之一就是用来指定容器要持有什么类型的对象，而且由编译器来保证类型的正确性
 * Practice2.java
 * @author sunny
 * 2016年12月9日上午7:38:17
 * @param <T>
 */
public class Practice2 <T>{
	private T a;
	private T b;
	private T c;
	
	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public T getC() {
		return c;
	}

	public void setC(T c) {
		this.c = c;
	}

	
	public Practice2(T a, T b, T c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static void main(String[] args) {
		Practice2<String> p2 = new Practice2<String>("a","b","c");
		System.out.println(p2.getA());
		System.out.println(p2.getB());
		System.out.println(p2.getC());
		
	}

}

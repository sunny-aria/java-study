package study.no9;

/**
 * 1.调用父类构造的时候，调用抽象方法会调用实现类的方法
 * @author sdf
 */
public class A extends Father{
	private int a = 1;
	@Override
	void print() {
		System.out.println("print A.a"+a);
	}
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}

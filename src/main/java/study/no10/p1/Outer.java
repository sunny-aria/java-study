package study.no10.p1;
/**
 * 内部类使用
 * Outer.java
 * @author sunny
 *2016年10月27日上午7:24:14
 */
public class Outer {
	class Inner{
		void print(){
			System.out.println("innerClass test");
		}
	}
	public Inner getInner(){
		return new Inner();
	}
	
	public static void main(String[] args) {
		Outer outer =new Outer();
		Outer.Inner inner = outer.getInner();
		inner.print();
	}

}

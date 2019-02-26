package study.no10.inner.practice26;
/**
 * 内部类的继承
 * WithInner.java
 * @author sunny
 * 2016年11月2日上午6:35:30
 */
public class WithInner {
	class Inner{
		public void f(){
			System.out.println("WithInner.inner");
		}
	}
	
	//带有参数构造的内部类
	class Inner2{
		String a;
		public Inner2(String a){
			this.a =a;
		}
		public void f(){
			System.out.println(a);
		}
	}
}

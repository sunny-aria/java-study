package study.no10.inner.practice26;
/**
 * 内部类继承内部类
 * InheritInner2.java
 * @author sunny
 * 2016年11月2日上午6:45:37
 */
public class InheritInner2 {
	class InheritInner22 extends WithInner.Inner2{

		public InheritInner22(WithInner withInner, String a) {
			withInner.super(a); //内部类继承内部类的super()写法
		}
		
	}
	
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner2 ii = new InheritInner2();
		InheritInner22 ii22 = ii.new InheritInner22(wi,"12312312312");//使用外围类   outerClass.new 创建内部类
		ii22.f();
		
	}
}

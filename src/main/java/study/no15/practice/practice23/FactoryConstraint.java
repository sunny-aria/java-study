package study.no15.practice.practice23;
/**
 * 创建类型实例，
 * 类型擦除后，有些时候丢失了在泛型代码中执行某些操作，
 * 任何在运行时需要制定的确切类型信息的操作都将无法工作。
 *  引用类型标签+加反射，要求类型标签类具有默认的构造函数。
 *  解决这个问题，建议使用显示的工厂，并将限制其类型，使得只能
 *  接受实现了这个工厂的类
 * FactoryConstraint.java
 * @author sunny
 * 2016年12月20日上午7:36:02
 */
public class FactoryConstraint {
	
	public static void main(String[] args) {
		System.out.println(new Foo2<Integer,Integer>(new IntegerFactory()));
		System.out.println(new Foo2<Widget,String>(new Widget.FactoryImpl()));
		System.out.println("------------------------");
		System.out.println(new Foo2<Integer,Integer>(new IntegerFactory(),50));
		System.out.println(new Foo2<Widget,String>(new Widget.FactoryImpl(),"sunny"));
	}

}

interface Factory<T,A>{
	T create();//使用默认构造
	T create(A a );//使用有参构造
}

class Foo2<T, A>{
	private T x;
	public <F extends Factory<T,A>> Foo2(F factory){
		x = factory.create();
	}
	public <F extends Factory<T,A>> Foo2(F factory,A a){
		x= factory.create(a);
	}
	
	@Override
	public String toString() {
		return "Foo2 [x=" + x + "]";
	}
	
}

class IntegerFactory implements Factory<Integer,Integer>{

	@Override
	public Integer create() {
		
		return new Integer(0);
	}

	@Override
	public Integer create(Integer a) {
		
		return new Integer(a);
	}
	
}

class Widget{
	public Widget(){}
	private String a;
	public Widget(String a){
		this.a=a;
	}
	public static class FactoryImpl implements Factory<Widget,String>{

		@Override
		public Widget create() {
			
			return new Widget();
		}

		@Override
		public Widget create(String a) {
			
			return new Widget(a);
		}
		
	}
	@Override
	public String toString() {
		return "Widget [a=" + a + "]";
	}
	
}




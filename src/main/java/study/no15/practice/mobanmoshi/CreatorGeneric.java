package study.no15.practice.mobanmoshi;
/**
 * 模式方法设计模式，get()是模板发放，create() 是在子类中定义的，用来产生子类类型的对象
 * GenericWithCreate.java
 * @author sunny
 * 2016年12月20日上午8:34:59
 */
abstract  class GenericWithCreate<T> {
	final T element;
	GenericWithCreate(){
		element = create();
	}
	abstract T create() ;
}
class X{}
class Creator extends GenericWithCreate<X>{

	@Override
	X create() {
		
		return new X();
	}
	void f(){
		System.out.println(element.getClass().getSimpleName());
	}
	
}

public class CreatorGeneric{
	public static void main(String[] args){
		Creator c = new Creator();
		c.f();
	}
}
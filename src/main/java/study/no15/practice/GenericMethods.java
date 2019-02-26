package study.no15.practice;
/**
 * 方法使用泛型
 * GenericMethods.java
 * @author sunny
 * 2016年12月13日上午8:18:46
 */
public class GenericMethods {
	public static <T,E,F>  void  f(T t,E e,F f){//方法接受多种不同类型的参数
		System.out.print("T:"+t.getClass().getSimpleName()+" ");
		System.out.print("E:"+e.getClass().getSimpleName()+" ");
		System.out.println("F:"+f.getClass().getSimpleName()+" ");
	}
	
	public static <T,E,F>  void  g(T t,E e,F f,String arg4){//方法接受多种不同类型的参数和具体的类型参数
		System.out.print("T:"+t.getClass().getSimpleName()+" ");
		System.out.print("E:"+e.getClass().getSimpleName()+" ");
		System.out.print("F:"+f.getClass().getSimpleName()+" ");
		System.out.println("arg4:"+arg4.getClass().getSimpleName()+" ");
	}
	
	public static void main(String[] args) {
		/*
		 * 当使用泛型类的时候，必须在创建对象的时候指定具体类型，而使用泛型方法，通常不必指明参数类型，
		 * 编译器会为我们找出具体的类型
		 * */
		f(1,2l,"sunny"); 
		g(1,2l,(short)3,"123");
	}

}

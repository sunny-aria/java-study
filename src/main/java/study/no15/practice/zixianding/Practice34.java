package study.no15.practice.zixianding;
/**
 * 自限定练习
 * Practice34.java
 * @author sunny
 * 2016年12月30日上午8:26:34
 */
public abstract class Practice34<T extends Practice34<T>>{

	abstract  T get(T arg);
	
	T f(T arg){
		System.out.println("调用父类get()方法");
		return get(arg);
	}
}

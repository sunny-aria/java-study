package study.no15.practice.xiebianandnibian;
/**
 * 泛型
 * Holder.java
 * @author sunny
 * 2016年12月27日上午7:57:39
 */
public class Holder<T> {
	private T value;
	public Holder(){}
	public Holder(T val){value=val;}
	public void set(T val){
		value=val;
	}
	public T get( ){
		return value;
	}
	public boolean equals(Object obj){
		return value.equals(obj);
	}
	public static void main(String[] args) {
		Holder<Apple> Apple = new Holder<Apple>(new Apple());
		Apple d=Apple.get();
		Apple.set(d);
		
		Holder<? extends Fruit> fruit = Apple;
		Fruit p = fruit.get();
		d = (study.no15.practice.xiebianandnibian.Apple) fruit.get();
		try{
			Orange c = (Orange) fruit.get();
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(fruit.equals(d));
	}

}

package study.no15.practice;
/**
 * 用来记录生成了多少对象
 * CountObject.java
 * @author sunny
 * 2016年12月14日上午7:55:26
 */
public class CountObject {
	private static long counter=0;
	private final long id =counter++;
	public String toString(){
		return this.getClass().getSimpleName()+" "+id;
	}
}

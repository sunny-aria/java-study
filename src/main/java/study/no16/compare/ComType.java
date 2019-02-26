package study.no16.compare;

import java.util.Arrays;
import java.util.Random;

import study.no15.practice.Generator;

/**
 * 第一种排序类实现Comparable接口
 * 第二种自定义一个实现Comparator的类，
 * 这种方法可能不希望使用第一种已经实现的排序规则，想自定义另外一种排序规则
 * ComType.java
 * @author sunny
 * 2017年1月17日上午8:16:00
 */
public class ComType implements Comparable<ComType> {
	 int i,j;
	 private static int count=1;
	 public ComType(int n1,int n2){
		 i=n1;j=n2;
	 }
	 
	@Override
	public String toString() {
		 String result = " [i=" + i + ", j=" + j + "]";
		 if(count++%3==0){
			 result+="\n";
		 }
		 return result;
	}

	@Override
	public int compareTo(ComType o) {
		return (i<o.i?-1:(i==o.i?0:1));
	}
	private static Random r = new Random(47);
	public static Generator<ComType> generator(){
		return new Generator<ComType>(){
			@Override
			public ComType next() {
				return new ComType(r.nextInt(100),r.nextInt(100));
			}
		};
	}
	
	public static void main(String[] args) {
		ComType[] a = new ComType[12];
		for(int i=0;i<a.length;i++){
			a[i]=generator().next();
		}
		System.out.println("before sort:"+Arrays.toString(a));
		Arrays.sort(a);//使用排序方法
		System.out.println("after sort:"+Arrays.toString(a));
	}
}

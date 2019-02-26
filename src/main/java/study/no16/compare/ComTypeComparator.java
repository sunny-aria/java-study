package study.no16.compare;

import java.util.Arrays;
import java.util.Comparator;
/**
 * 第二种排序方法，自己实现接口Comparator,假设有人给你一个并没有实现Comparable 的类，或者给你的类实现了Comparable,
 * 但是你不喜欢它的实现方式，你需要另外一种不同的比较方法。解决这种问题，自己实现接口Comparator。
 * ComTypeComparator.java
 * @author sunny
 * 2017年1月17日上午8:31:27
 */
public class ComTypeComparator implements Comparator<ComType> {

	@Override
	public int compare(ComType o1, ComType o2) {
		return o1.j<o2.j?-1:(o1.j==o2.j?0:1);
	}
	
	public static void main(String[] args) {
		ComType[] a = new ComType[12];
		for(int i=0;i<a.length;i++){
			a[i]=ComType.generator().next();
		}
		System.out.println("before sort:"+Arrays.toString(a));
		Arrays.sort(a,new ComTypeComparator());
		System.out.println("after sort:"+Arrays.toString(a));
	}
}

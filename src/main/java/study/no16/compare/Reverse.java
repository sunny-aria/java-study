package study.no16.compare;

import java.util.Arrays;
import java.util.Collections;

/**
 * 排序反转  collections.reverseOrder(),反转自然排序顺序
 * Reverse.java
 * @author sunny
 * 2017年1月17日上午8:27:08
 */
public class Reverse {
	public static void main(String[] args) {
		ComType[] a = new ComType[12];
		for(int i=0;i<a.length;i++){
			a[i]=ComType.generator().next();
		}
		System.out.println("before sort:"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("after sort:"+Arrays.toString(a));
		
	}
}

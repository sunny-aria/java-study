package study.no16;

import java.util.Arrays;

/**
 * 测试浅复制,System.arraycopy()
 * CopyArrays.java
 * @author sunny
 * 2017年1月16日上午8:41:21
 */
public class CopyArrays {

	public static void main(String[] args) {
		int[] a = new int[7];
		int[]b = new int[10];
		Arrays.fill(a, 47);
		Arrays.fill(b, 100);
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		BerylliumSphere[] bs = new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};
		BerylliumSphere[] bs2 = new BerylliumSphere[10];
		System.arraycopy(bs, 0, bs2, 3, bs.length);
		System.out.println(Arrays.toString(bs2));
	}

}

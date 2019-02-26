package study.no16;

import java.util.Arrays;

/**
 * 练习1
 * Practice1.java
 * @author sunny
 * 2017年1月11日上午8:18:16
 */
public class Practice1 {
	//练习1
	public static void  f(BerylliumSphere[] bs){
		if(bs==null){ System.out.println("BerylliumSphere[] is null.");}
		System.out.println(bs.length);
		/*for(int i=0;i<bs.length;i++){
			System.out.println(bs[i]);
		}*/
		System.out.println(Arrays.toString(bs));
	}
	public static BerylliumSphere[] g(int n){
		return new BerylliumSphere[n];
	}
	public static void main(String[] args) {
		f(new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()});
		//练习2
		BerylliumSphere[] bs = g(5);
		for(int i=0;i<bs.length;i++){
			bs[i]=new BerylliumSphere();
		}
		System.out.println(Arrays.toString(bs));
	}
}

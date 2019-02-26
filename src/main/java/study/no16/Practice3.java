package study.no16;

import java.util.Arrays;

/**
 * 练习3-7
 * Practice3.java
 * @author sunny
 * 2017年1月12日上午8:05:35
 */
public class Practice3 {
	public static  void f(int a,int b){
		BerylliumSphere[][] bs = new BerylliumSphere[a][b];//创建一个二维数组
		for(int i=0;i<a;i++){
			bs[i]=new BerylliumSphere[b];
			for(int j=0;j<b;j++){
				bs[i][j]=new BerylliumSphere();
			}
		}
		System.out.println(Arrays.deepToString(bs));//使用Arrays.deepToString() 打印数组内容
	}
	
	public static void g(){
		int[][][] a = new int[1][2][3];
		System.out.println(Arrays.deepToString(a));
		BerylliumSphere[][][] bs = new BerylliumSphere[2][2][3];
		System.out.println(Arrays.deepToString(bs));
	}
	//练习8
	public static void h(){
		Object[] obj = new Object[5];
		obj[0] = 1;
		obj[1] = new BerylliumSphere();
		System.out.println(Arrays.deepToString(obj));
	}
	public static void main(String[] args) {
		f(3,5);
		g();
		h();
	}

}

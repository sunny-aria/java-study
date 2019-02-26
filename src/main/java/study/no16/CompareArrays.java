package study.no16;

import java.util.Arrays;

/**
 * 数组比较，基本类型比较采用包装类型的equals,引用调用Object.equals()比较内容
 * 使用Arrays.equals() 比较
 * CompareArrays.java
 * @author sunny
 * 2017年1月17日上午7:33:34
 */
public class CompareArrays {
	
	public static void main(String[] args) {
		BerylliumSphere[] bs = new BerylliumSphere[2];
		BerylliumSphere[] bs2 = new BerylliumSphere[2];
		System.out.println(Arrays.equals(bs, bs2));
		//练习19
		App[] as= new App[]{new App(1),new App(1)};
		App[] as2 = new App[]{new App(1),new App(1)};
		System.out.println(Arrays.equals(as, as2));
		//练习20 使用 deepEquals 比较多维数组
		App[][] apps=new App[2][2];
		App[][] apps1=new App[2][2];
		for(int i=0;i<2;i++){
			apps[i]=new App[2];
			apps1[i]=new App[2];
			for(int j=0;j<2;j++){
				apps[i][j]=new App(1);
				apps1[i][j]=new App(1);
			}
		}
		System.out.println(Arrays.deepEquals(apps, apps1));
	}

}

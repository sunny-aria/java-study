package study.no16.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import study.no15.practice.Generator;
import study.no16.App;
import study.no16.RandomGenerator;

/**
 * 数组查找 Arrays.binarySearch 对已经排序的数组进行快速查找
 * ArraySearching.java
 * @author sunny
 * 2017年1月19日上午8:22:22
 */
public class ArraySearching {

	public static void main(String[] args) {
		Generator<Integer> gen =new RandomGenerator.Integer(1000);
		int[] a = new int[10];
		for(int i=0;i<10;i++){
			a[i] = gen.next();
		}
		System.out.println("before sort:"+Arrays.toString(a));
		
		int r = gen.next();
		//这是一个错误的尝试
		/*int location = Arrays.binarySearch(a, r);//对未排序的数组使用binaraySearch不可预知
		System.out.println("Location of "+r+" is "+location+" ,a["+location+"]="+a[location]);*/
		
		Arrays.sort(a);
		System.out.println("after sort:"+Arrays.toString(a));
		while(true){
			int rr = gen.next();
			int location = Arrays.binarySearch(a, rr);//对未排序的数组使用binaraySearch不可预知
			if(location>=0){
				System.out.println("Location of "+rr+" is "+location+" ,a["+location+"]="+a[location]);
				break;
			}
		}
		Integer[] aa = new Integer[10];
		for(int i=0;i<10;i++){
			aa[i] = gen.next();
		}
		System.out.println("before sort:"+Arrays.toString(aa));
		Arrays.sort(aa,Collections.reverseOrder());
		System.out.println("after reverse sort:"+Arrays.toString(aa));
		
		
		//对象可查找
		App[] as = new App[]{new App(1),new App(2),new App(3)};
		//自己实现排序规则
		Arrays.sort(as,new ObjComparator());
		App app = new App(2);
		int location = Arrays.binarySearch(as, app,new ObjComparator()); //sort 也必须使用自定义排序
		System.out.println("app location:"+location);		
	}
	//注意静态内部类和内部类 new 时候的区别
	static class ObjComparator implements Comparator<App>{

		@Override
		public int compare(App o1, App o2) {
			return o1.getA()-o2.getA();
		}
	}
}

package study.no15.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 使用Number 和Integer 证明数组的协变性
 * Practice26.java
 * @author sunny
 * 2016年12月22日上午8:05:06
 */
public class Practice26 {

	public static void main(String[] args) {
		Number[] n=new Integer[10];
		n[0]=1;
		System.out.println(Arrays.asList(n));
		List<? extends Number> list = new ArrayList<Integer>();
//		list.add(1);//? extends Number  可以是任何事物，编译器不清楚传入的是什么
		list.add(null);
	}

}

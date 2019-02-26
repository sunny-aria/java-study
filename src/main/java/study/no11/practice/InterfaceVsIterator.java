package study.no11.practice;

import java.util.Collection;
import java.util.Iterator;

/**
 * Collection and Iterator
 * InterfaceVsIterator.java
 * @author sunny
 * 2016年11月7日上午7:50:37
 */
public class InterfaceVsIterator {
	//①使用iterator 遍历
	public static void display(Iterator<String> it){
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
	}
	//②使用collection 遍历
	public static void display(Collection<String> list){
		for(String a:list){
			System.out.println(a);
		}
		System.out.println();
	}
}

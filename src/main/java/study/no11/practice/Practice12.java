package study.no11.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice12 {
	public static void main(String[] args) {
		List<Integer> la = new ArrayList<Integer>();
		List<Integer> lb = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++){
			la.add(i);
		}
		
		//使用listIterator(int index) 反向输出list
		//ListIterator 可以使用previous() or next() 向前查找或向后查找
		ListIterator<Integer> iterator = la.listIterator(la.size());
		
		while(iterator.hasPrevious()){
			lb.add(iterator.previous());
		}
		
		System.out.println(lb);
		
	}
}

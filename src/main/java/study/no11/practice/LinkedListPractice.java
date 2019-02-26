package study.no11.practice;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 测试linkedList 插入
 * LinkedListPractice.java
 * @author sunny
 * 2016年11月3日上午8:16:27
 */
public class LinkedListPractice {

	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<10;i++){
			//使用ListIterator 从中间插入
			/*ListIterator<Integer> iterator = list.listIterator(list.size()/2);
			list.add(iterator.nextIndex(),i);*/
			
			//测试linkedlist 的头、尾, addFirst  add  addLast 的区别
			list.addFirst(i); 
//			list.add(i);
//			list.addLast(i);
			/*经过测试 addFirst 始终插入头部，先前插入的元素往后移
			 * add ，addLast 方法相同，在集合的末尾插入*/
		}
		System.out.println(list);
		
		for(int i=10;i>0;){
			System.out.println(list.get(--i));
		}
		
	}
}

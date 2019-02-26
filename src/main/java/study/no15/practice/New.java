package study.no15.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * 利用泛型参数判断，
 * Map<Person,List<? extends Pet>> petPeople = new HashMap<Person,List<? extends Pet>>();
 * 避免写多次泛型，可以利用泛型参数判断
 * New.java
 * @author sunny
 * 2016年12月13日上午8:26:34
 */
public class New {
	public static <K,V> Map<K,V> map(){
		return new HashMap<K,V>();
	}
	
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> llist(){
		return new LinkedList<T>();
	}
	
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	
	public static <T> Queue<T> queue(){
		return new LinkedList<T>();
	}
	
}

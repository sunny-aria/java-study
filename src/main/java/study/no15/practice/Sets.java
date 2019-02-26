package study.no15.practice;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * set 实用工具
 * Sets.java
 * @author sunny
 * 2016年12月15日上午7:25:41
 */
public class Sets {
	/**
	 * 合并
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T> Set<T> union(Set<T> a,Set<T> b){
		Set<T> result = null;
		if(a instanceof EnumSet){
			result = extracted(a);
		}else{
			result = new HashSet<T>(a);
		}
		result.addAll(b);
		return result;
	}
	/**
	 * 交集
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T> Set<T> intersection(Set<T> a,Set<T> b){
		Set<T> result = null;
		if(a instanceof EnumSet){
			result = extracted(a);
		}else{
			result = new HashSet<T>(a);
		}
		result.retainAll(b);
		return result;
	}
	/**
	 * 移除子集
	 * @param superset
	 * @param subset
	 * @return
	 */
	public static <T> Set<T> difference(Set<T> superset,Set<T> subset){
		Set<T> result = null;
		if(superset instanceof EnumSet){
			result = extracted(superset);
		}else{
			result = new HashSet<T>(superset);
		}
		result.remove(subset);
		return result;
	}
	/**
	 * 交集之外的所有元素
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T> Set<T> complement(Set<T> a,Set<T> b){
		return difference(union(a,b), intersection(a, b));
	}
	
	private static <E> EnumSet extracted(Set<E> a) {
		return ((EnumSet) a).clone();
	}
}

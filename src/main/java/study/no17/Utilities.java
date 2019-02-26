package study.no17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * collections 的些方法调用测试
 * Utilities.java
 * @author sunny
 * 2017年2月20日上午8:22:47
 */
public class Utilities {
	static List<String> list = Arrays.asList("one Two three Four five six one".split(" "));
	
	public static void main(String[] args) {
		print(list);
		print("'list' disjoint(Four)?:"+Collections.disjoint(list, Collections.singletonList("Four")));
		print("max:"+Collections.max(list));
		print("min:"+Collections.min(list));
		print("max w/ comparator:"+Collections.max(list, String.CASE_INSENSITIVE_ORDER));
		print("min w/ comparator:"+Collections.min(list, String.CASE_INSENSITIVE_ORDER));
		List<String> sublist =Arrays.asList("Four five six".split(" "));
		print("indexOfSublist: "+Collections.indexOfSubList(list, sublist));
		print("lastIndexOfSublist:"+Collections.lastIndexOfSubList(list, sublist));
		Collections.replaceAll(list, "one", "Yo");
		print("replaceAll:"+list);
		Collections.reverse(list);
		print("reverse:"+list);
		Collections.rotate(list,3);
		print("rotate:"+list); 
		List<String> source = Arrays.asList("in thre matrix".split(" "));
		Collections.copy(list, source);
		print("copy:"+list);
		Collections.swap(list, 0, list.size()-1);
		print("swap:"+list);
		Collections.shuffle(list,new Random(47));
		print("shuffle:"+list);
		Collections.fill(list, "pop");
		print("fill:"+list);
		print("frequency of 'pop':"+Collections.frequency(list, "pop"));
		List<String> dups = Collections.nCopies(3, "snap");
		print("dups:"+dups);
	}

	public static  void print(Object c){
		System.out.println(c);
	}
}

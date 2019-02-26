package study.no15.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import study.no15.practice.story.StoryCharacters;
import study.no15.practice.story.StoryGenerator;

/**
 * 使用generator 泛型方法
 * Practice16.java
 * @author sunny
 * 2016年12月14日上午7:35:27
 */
public class Generators {

	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
		for(int i=0;i<n;i++){
			coll.add(gen.next());
		}
		return coll;
	}
	//使用collection的导出类：list queue set ，通过这种方式不会丢失容器的类型
	public static <T> List<T> fill(List<T> list,Generator<T> gen,int n){
		for(int i=0;i<n;i++){
			list.add(gen.next());
		}
		return list;
	}
	public static <T> Set<T> fill(Set<T> set,Generator<T> gen,int n){
		for(int i=0;i<n;i++){
			set.add(gen.next());
		}
		return set;
	}
	
	public static void main(String[] args) {
		List<StoryCharacters> list = fill(new ArrayList<StoryCharacters>(),new StoryGenerator(),5);
		System.out.println(list);
		List<Integer> set = fill(new ArrayList<Integer>(),new Fibonacci(),10);
		System.out.println(set);
	}

}

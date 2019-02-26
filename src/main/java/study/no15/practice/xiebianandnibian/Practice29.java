package study.no15.practice.xiebianandnibian;

import java.util.ArrayList;
import java.util.List;

public class Practice29 {

	static void f1(Holder<List<?>> holder){
		List<?> list = holder.get();
		System.out.println(list.isEmpty());
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.remove(0));
		System.out.println(list.toArray());
	}
	
	static void f2(List<Holder<?>> list){
		Holder<?> holder = list.get(0);
		System.out.println(holder.get()+"----");
		System.out.println(list.isEmpty());
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.remove(0));
		System.out.println(list.toArray());
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		Holder holder = new Holder<List<Integer>>();
		holder.set(list);
		f1(holder);//holder 只能使用Holder holder  不能带泛型
		
		Holder<?> hold = new Holder<Integer>(1);
		List ls = new ArrayList<Holder<Integer>>();
		ls.add(hold);
		f2(ls);
	}

	

}

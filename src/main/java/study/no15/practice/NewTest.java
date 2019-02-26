package study.no15.practice;

import java.util.Map;
import java.util.Set;

public class NewTest {

	public static void f(Map<String,String> map){
		map.put("test", "sunny");
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		Map<String,String> map = New.map();
		map.put("1", "2");
		
		Set<Integer> set = New.set();
		set.add(1);
		// （this|类名）.<类型参数>method(); 显示的指明类型
		// 在点操作符和方法名之间插入尖括号，然后把类型置于尖括号内。
		//如果在定义该方法的类的内部，必须在点操作符之前使用this.
		//如果是使用static方法，必须在点操作符之前加上类名
		f(New.<String,String>map());
	}

}

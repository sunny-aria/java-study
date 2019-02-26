package study.no15.practice.xiebianandnibian;

import java.util.List;

/**
 * 使用超类型边界，逆变，向一个泛型类型写入。
 * 因此你可能会根据如何向一个泛型类型“写入”（传递给一个方法），以及如何能够从一个
 * 泛型类型中“读取”（从一个方法中返回），来着手思考超类型和子类型边界。
 * SuperTypeWildcards.java
 * @author sunny
 * 2016年12月27日上午8:12:55
 */
public class SuperTypeWildcards {
	/**
	 * 使用父类不安全，只能写入Apple的导出类
	 * @param apples
	 */
	static void writeTo(List<? super Apple> apples){
		apples.add(new Apple());
		apples.add(new Hongfushi());
//		apples.add(new Fruit());//编译器发生错误
	}
}

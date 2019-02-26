package study.no16;

import java.util.Arrays;

public class ParameterArrayType {
	
	
	public static void main(String[] args) {
		Integer[] ints = {1,2,3,4,5};
		ints = MethodParameter.f(ints);
		Double[] ds = {1.1,2.2,3.3};
		ds = MethodParameter.f(ds);
		
		System.out.println(Arrays.deepToString(ints));
		System.out.println(Arrays.deepToString(ds));
	}

}
class MethodParameter{
	//泛型与数组使用
	public static <T> T[] f(T[] args){
		return args;
	}
}
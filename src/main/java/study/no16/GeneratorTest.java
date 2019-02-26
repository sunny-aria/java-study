package study.no16;

import study.no15.practice.Generator;

/**
 * 使用反射，使用生成器
 * GeneratorTest.java
 * @author sunny
 * 2017年1月19日上午8:08:32
 */
public class GeneratorTest {
	private static int size =10;
	
	public static void test(Class<?> surroundingClass){
		for(Class<?> type: surroundingClass.getClasses()){
			System.out.print(type.getSimpleName()+":");
			try {
				Generator<?> g = (Generator<?>) type.newInstance();
				for(int i=0;i<size;i++){
					System.out.print(g.next()+" ");
				}
				System.out.println();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		test(CountingGenerator.class);
		test(RandomGenerator.class);
	}

}

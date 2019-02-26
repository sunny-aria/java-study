package study.no15.practice;
/**
 * 测试BasicGenerator 类生成器
 * BasicGeneratorDemo.java
 * @author sunny
 * 2016年12月14日上午7:57:33
 */
public class BasicGeneratorDemo {

	public static void main(String[] args) {
		Generator<CountObject> gen = BasicGenerator.create(CountObject.class);
		for(int i=0;i<10;i++){
			System.out.println(gen.next());
		}
		System.out.println("---使用new BasicGenerator(type) 构造器---");
		Generator<CountObject> ge = new BasicGenerator<>(CountObject.class);
		for(int i=0;i<10;i++){
			System.out.println(ge.next());
		}
	}

}

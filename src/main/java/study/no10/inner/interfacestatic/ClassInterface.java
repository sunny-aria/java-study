package study.no10.inner.interfacestatic;
/**
 * 接口嵌套类
*ClassInterface.java
 * @author sunny
 *2016年10月31日上午7:57:13
 */
public interface ClassInterface {
	void howdy();
	
	//接口中的任何类都是public static 的
	class Test implements ClassInterface{
		@Override
		public void howdy() {
			System.out.println("test 接口嵌套类");
		}
		
		public static void main(String[] args) {
			new Test().howdy();
		}
	}

	
	class TestB implements ClassInterface{
		static void f(){
			new TestB().howdy();
		}

		@Override
		public void howdy() {
			System.out.println("TestB");
		}
	}
	
}

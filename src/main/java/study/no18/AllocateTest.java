package study.no18;

import java.nio.ByteBuffer;

/**
 * 测试allocate 与allocateDirect的区别
 * AllocateTest.java
 * @author sunny
 * 2017年3月13日上午7:46:09
 */
public class AllocateTest {
	
	
	private abstract static class Test{
		private String name;
		private Test(String name){this.name=name;}
		private void tester(){
			long start = System.currentTimeMillis();
			test();
			long end = System.currentTimeMillis();
			System.out.println(name+" "+"duration time:"+(end-start));
		}
		public abstract  void test();
		}
	
	public static void main(String[] args) {
		Test[] tests  = new Test[]{
				new Test("allocate"){
					@Override
					public void test() {
						ByteBuffer buff = ByteBuffer.allocate(100);
						buff.asCharBuffer().put("sunny test");
						buff.rewind();//倒回数据开始的部分
						char c;
						while((c=buff.getChar())!=0){
							System.out.println(c);
						}
					}},
				new Test("allocateDirect"){
					@Override
					public void test() {
						ByteBuffer buff = ByteBuffer.allocateDirect(100);
						buff.asCharBuffer().put("sunny test");
						buff.rewind();//倒回数据开始的部分
						char c;
						while((c=buff.getChar())!=0){
							System.out.println(c);
						}
					}}
		};
		
		
		for(Test test:tests){
			test.tester();
		}
	}

}

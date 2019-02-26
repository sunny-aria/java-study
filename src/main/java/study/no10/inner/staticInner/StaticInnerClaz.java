package study.no10.inner.staticInner;

import study.no10.inner.factoryModel.Cycle;
/**
 * 	嵌套内部类，当内部类为static 时
 * 1.创建嵌套类的对象，并不需要外围类的对象
 * 2.不能从嵌套类对象访问非静态外围类对象
 * 3.不能使用外围类.this 返回外围类引用
*StaticInnerClaz.java
 * @author sunny
 *2016年10月31日上午7:35:33
 */
public class StaticInnerClaz {
	
	private static class  UiCycleImpl implements Cycle{

		@Override
		public String run() {
			return "static claz UniCycleImpl";
		}
		
		private static class CiCycleImpl implements Cycle{
			@Override
			public String run() {
				// TODO Auto-generated method stub
				return "Cicyle";
			}
			
		}
		
	}
	
	public static  Cycle getCycle(){
//		return new UiCycleImpl();
		return new UiCycleImpl.CiCycleImpl(); //嵌套类中嵌套类
	}
	public static void main(String[] args) {
		System.out.println(getCycle().run());;
	}
}

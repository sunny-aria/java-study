package study.no10.inner.jubuclaz;

import study.no10.p2.Destination;
/**
 *  测试方法内局部内部类，方法内作用域局部内部类，普通传统私有内部类（不希望被其他地方使用）
*JubuClaz.java
 * @author sunny
 *2016年10月28日上午7:32:46
 */
public class JubuClaz {
	
	//方法内部类
	public Destination destination(){
		class PDestination implements Destination{
			@Override
			public String des() {
				return "pdestination 方法局部类测试";
			}
		}
		return  new PDestination();
	}
	
	public Destination Destination(String message){
		if("1".equals(message)){
			//方法内作用域局部类
			class ADestination implements Destination{
				@Override
				public String des() {
					return message+"ADestination";
				}
			}
			return new ADestination(); //出了此if ，ADestination不可使用
		}
		return null;
	}
	
	//普通内部类
	private  class ChuanTongInner implements Destination{
		@Override
		public String des() {
			return "chuanTongInner  Destination";
		}
	}
	
	public Destination  getChuanTongInner(){
		return new ChuanTongInner();
	}
	
	
}

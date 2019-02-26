package study.no15.practice.practice37;

import java.util.Date;

/**
 * 混型，与接口混合
 * Mixins.java
 * @author sunny
 * 2017年1月3日上午8:19:14
 */
public class Mixins {
	//混型练习
	public static void main(String[] args) {
		Mixin mixin = new Mixin(),mixin2 = new Mixin();
		mixin.set("sunny");
		mixin2.set("sunny-test");
		System.out.println(mixin.getVal()+" time:"+mixin.getStamp()+" num:"+mixin.getSerialNumber());
		System.out.println(mixin2.getVal()+" time:"+mixin2.getStamp()+" num:"+mixin2.getSerialNumber());
	}

}

interface TimeStamped{ long getStamp();}
class TimeStampedImpl implements TimeStamped{
	private final long timeStamp;
	public TimeStampedImpl(){
		timeStamp = new Date().getTime();
	}
	@Override
	public long getStamp() {
		
		return timeStamp;
	}
}

interface SerialNumbered{ long getSerialNumber();}
class SerialNumberedImpl implements SerialNumbered{
	private static long counter =1;
	private final long serialNumber = counter++;//思路可用于统一订单生成
	@Override
	public long getSerialNumber() {
		
		return serialNumber;
	}
}

class Basic{
	String val;
	public void set(String val){
		this.val=val;
	}
	public String getVal(){
		return val;
	}
}

class Mixin extends Basic implements TimeStamped,SerialNumbered{
	private TimeStampedImpl time = new TimeStampedImpl();
	private SerialNumberedImpl serial = new SerialNumberedImpl();
	@Override
	public long getSerialNumber() {
		
		return serial.getSerialNumber();
	}

	@Override
	public long getStamp() {
		
		return time.getStamp();
	}
	
}
package study.no12.practice;
/**
 * 基类异常捕获，捕获基类异常以及所有从它派生的异常
 * Practice25.java
 * @author sunny
 * 2016年11月14日上午8:17:33
 */
public class Practice25_A {
	public void event()throws Exception1{
		throw new Exception1("e1");//没有这种构造器，必须自己写子类参数构造器
	}
	
	public static void main(String[] args) {
		Practice25_A p25c = new Practice25_C();
		try {
			p25c.event();
		}  catch (Exception1 e) {//捕获基类异常以及所有从它派生的异常
			e.printStackTrace(System.out);
		}
	}
}

class Exception1 extends Exception{
	public Exception1(String string) {
		super(string);
	}}
class Exception2 extends Exception1{
	public Exception2(String string) {
		super(string);
	}}
class Exception3 extends Exception2{
	public Exception3(String string) {
		super(string);
	}}

class Practice25_B extends Practice25_A{
	public void event()throws Exception2{
		throw new Exception2("e2");
	}
}
class Practice25_C extends Practice25_B{
	public void event()throws Exception3{
		throw new Exception3("e3");
	}
}


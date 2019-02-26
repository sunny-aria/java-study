package study.no12.practice;

import study.no12.practice.ExceptionTest.MyException;
import study.no12.practice.Practice6.MyException1;
import study.no12.practice.Practice6.MyException2;

/**
 * 练习9 ，一个catch捕获所有异常
 * Practice9.java
 * @author sunny
 * 2016年11月9日上午8:10:37
 */
public class Practice9 {

	/**
	 * 一个方法，3个异常说明
	 * @throws MyException1
	 * @throws MyException2
	 * @throws MyException
	 */
	public void t()throws MyException1,MyException2,MyException{
		System.out.println("测试捕获所有异常");
		ExceptionTest et = new ExceptionTest();
		throw et.new MyException("MyException");
	}
	
	public static void main(String[] args) {
		Practice9 p9 = new Practice9();
		Practice6 p6 = new Practice6();
		try {
			p9.t();
		} catch (Exception e) {
			p6.new MyException2().logException(e);;
		}
	}
}

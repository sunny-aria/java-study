package study.no12.practice;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * 创建2个异常类，记录日志
 * Practice6.java
 * @author sunny
 * 2016年11月9日上午7:50:48
 */
public class Practice6 {
	
	//异常类1
	class MyException1 extends Exception{
		private  Logger logger = Logger.getLogger("MyException1");
		public MyException1(){
			StringWriter trace = new StringWriter();
			printStackTrace(new PrintWriter(trace));
			logger.severe(trace.toString());
		}
	}
	
	//异常类2
	class MyException2 extends Exception{
		private  Logger logger = Logger.getLogger("MyException2");
		
		//将Exception 作为参数传递，并记录日志
		void logException(Exception e){
			StringWriter trace = new StringWriter();
			e.printStackTrace(new PrintWriter(trace));
			logger.severe(trace.toString());
		}
	}
	
	public static void main(String[] args) {
		Practice6 p6 =new Practice6();
		try{
			throw p6.new MyException1();
		}catch(MyException1 e1){
			System.err.println("catch1:"+e1);
			System.out.println("--------");
			try {
				throw p6.new MyException2();
			} catch (MyException2 e) {
//				System.err.println("catch2:"+e);
				p6.new MyException2().logException(e);
			}
		}
		
	}

}

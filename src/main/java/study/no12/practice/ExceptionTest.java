package study.no12.practice;
/**
 * ExceptionTest.java
 * @author sunny
 * 2016年11月8日上午8:40:17
 */
public class ExceptionTest {
	
	public static void main(String[] args) {
		//练习1
		try{
			throw new Exception("sunny test.");
		}catch(Exception ex){
			ex.printStackTrace(System.out);
			
		}finally{
			System.out.println("finally code.");
		}
		
		//练习2
		String str=null;
		try{
			str.equals("a");
		}catch(Exception id1){
			id1.printStackTrace(System.out);
		}
		//练习3
		String[] arr = {"a","b","c"};
		try{
			System.out.println(arr[3]);
		}catch(Exception ex){
			ex.printStackTrace(System.out);		
		}
		
		//练习4
		try{
			ExceptionTest t = new ExceptionTest();
			throw t.new MyException("myException test.");
		}catch(MyException ex){
			ex.printStackTrace(System.out);
		}
		
	}
	//练习4 自定义异常类
	class MyException extends Exception{
		public MyException(String message){super(message);}
		
	}
}

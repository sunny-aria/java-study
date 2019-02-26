package study.no12.practice;
/**
 * 运行时异常
 * MyRuntimeException.java
 * @author sunny
 * 2016年11月15日上午8:09:38
 */
class MyRuntimeException extends RuntimeException {

	public MyRuntimeException(Exception e) {
		super(e);
	}

}
public class WrapException {
	public static  void type(int type){
		try{
		switch(type){
			case 1: throw new NullPointerException();
			case 2:throw new IndexOutOfBoundsException();
			default:return;
		}
		}catch(Exception e){
			throw new MyRuntimeException(e);
		}
	}
	public static void main(String[] args) {
		type(1);//异常类继承自RuntimeException，编译器可以省略try 语句块，练习28
		try{
			for(int i=1;i<3;i++){
				type(i);
			}
		}catch(MyRuntimeException e){
			try {
				throw e.getCause();
			} catch (Throwable e1) {
				e1.printStackTrace(System.out);
			}
		}
		
		
		
	}
}

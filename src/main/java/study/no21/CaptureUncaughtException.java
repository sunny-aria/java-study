/**
 * 
 */
package study.no21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


/**
 * x线程捕获异常
 * CaptureUncaughtException.java
 * @author sunny
 * 2017年4月25日上午7:40:27
 */
public class CaptureUncaughtException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor(new HandlerThreadFactory());
		exec.execute(new ExceptionThread2());
		exec.shutdown();//不shutdown 可能出现不同的打印
	}

}
class ExceptionThread2 implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("run() by"+t);
		System.out.println(" eh="+ t.getUncaughtExceptionHandler());
		throw new RuntimeException();
	}
}
	class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

		@Override
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println("caught "+e);
		}
		
	}
	class HandlerThreadFactory implements ThreadFactory{

		@Override
		public Thread newThread(Runnable r) {
			System.out.println(this+" creating new Thread");
			Thread t = new Thread(r);
			System.out.println("created "+t);
			t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
			System.out.println("eh="+t.getUncaughtExceptionHandler());
			return t;
		}
		
	}
	

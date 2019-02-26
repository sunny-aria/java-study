/**
 * 
 */
package study.no21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import study.no15.practice.Fibonacci;

/**
 * Practice10.java
 * @author sunny
 * 2017年4月20日上午8:20:51
 */
public class Practice10 {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, Exception {
		System.out.println(new Practice10().runTask(3));
	}

	public int runTask(int n) throws InterruptedException, ExecutionException{
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<Integer> fu=exec.submit(new Callable<Integer>(){
			private Fibonacci fibo = new Fibonacci();
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=0;i<n;i++){
					sum+=fibo.next();
				}
				return sum;
			}});
		Integer sum = fu.get();//创建一个线程，最终调用Future.get() 求和，其实有些误导，这种和顺序编程没有区别，可以去掉线程的代码部分
		return sum;
	}
}

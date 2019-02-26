/**
 * 
 */
package study.no21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import study.no15.practice.Fibonacci;

/**
 * 使用callable接口，练习fibonacci
 * Practice5.java
 * @author sunny
 * 2017年4月18日上午8:32:28
 */
public class Practice5 implements Callable<Integer> {
	private int n=0;
	private Fibonacci fibo = new Fibonacci();
	public Practice5(int n){this.n=n;}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		List<Future<Integer>> list = new ArrayList<>();
		for(int i=1;i<5;i++){
			list.add(exec.submit(new Practice5(i*4)));
		}
		for(Future<Integer> fu:list){
			try {
				if(fu.isDone()){//调用get()之前，先调用具有超时的get()，或者调用isDone()查看任务是否完成
					System.out.println(fu.get());//get()将阻塞，直至结果准备就绪
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		exec.shutdown();
	}

	@Override
	public Integer call() throws Exception {
		int sum =0 ;
		for(int i=0;i<n;i++){
			sum+=fibo.next();
		}
		return sum;
	}

}

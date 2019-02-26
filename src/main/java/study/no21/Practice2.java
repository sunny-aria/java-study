package study.no21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import study.no15.practice.Fibonacci;

/**
 * 
 * Practice2.java
 * @author sunny
 * 2017年4月18日上午8:03:52
 */
public class Practice2 implements Runnable {
	private  int n;
	private final Fibonacci fibo = new Fibonacci();
	public Practice2(int n){
		this.n=n;
	}
	@Override

	public void run() {
//		synchronized (this) {
			int sum = 0;
			for(int i=0;i<n;i++){
				int fibonacci = fibo.next();
				System.out.println(n+":"+fibonacci);
				sum+=fibonacci;
			}
			System.out.println(n+"----:----"+sum);
//		}
	}
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);
		for(int i=1;i<3;i++){
			exec.submit(new Practice2(i*4));
		}
		exec.shutdown();
	}
}

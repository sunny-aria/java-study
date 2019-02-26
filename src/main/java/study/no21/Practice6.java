/**
 * 
 */
package study.no21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 使用sleep(),阻塞线程运行，一个线程阻塞后，运行交给其他线程运行
 * Practice6.java
 * @author sunny
 * 2017年4月19日上午7:24:12
 */
public class Practice6 implements Runnable {
	private int n;
	public Practice6(int n){
		this.n=n;
	}

	@Override
	public String toString() {
		return Thread.currentThread()+" [" + n + "s]";
	}

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r =new Random(47);
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++){
			exec.execute(new Practice6(r.nextInt(10)+1));//随机产生1-10 ，创建线程并执行
		}
		exec.shutdown();
	}
}

package study.no21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/**
 * 重载ThreadFactory 方法，实现线程池定制线程创建
 * SimpleThreadFactory.java
 * @author sunny
 * 2017年4月20日上午7:35:22
 */
public class SimpleThreadFactory implements ThreadFactory {
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setDaemon(true);
//		t.setPriority(priority);//定制设置优先级
		return t;
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService exec = Executors.newCachedThreadPool(new SimpleThreadFactory());
		for(int i=0;i<10;i++){
			exec.execute(new DaemonFromFactory());
		}
		TimeUnit.SECONDS.sleep(2);
		System.out.println("main Thread end.");//主线程一旦退出，主线程派生的子线程后台进程也会随之终止
		exec.shutdown();
	}

}

class DaemonFromFactory implements Runnable{

	@Override
	public void run() {
		while(true){
		System.out.println(Thread.currentThread().getName()+" run."+" isDaemon="+Thread.currentThread().isDaemon());
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
}
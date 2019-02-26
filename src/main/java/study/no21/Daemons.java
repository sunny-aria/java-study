/**
 * 
 */
package study.no21;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * 创建后台线程，后台线程随着非后台线程的终止而终止,
 * 主线程被设置成后台线程，派生出的许多子线程也是后台线程
 * Daemons.java
 * @author sunny
 * 2017年4月19日上午8:38:09
 */
public class Daemons {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread d = new Thread(new Daemon());
		d.setDaemon(true);//设置后台线程，必须在start()之前
		d.start();
		System.out.println("d.isDaemon()="+d.isDaemon());
		TimeUnit.SECONDS.sleep(1);
	}

}
class Daemon implements Runnable{
	private Thread[] t = new Thread[10];
	@Override
	public void run() {
		for(int i=0;i<t.length;i++){
			t[i]=new Thread(new DaemonSpawn());
			t[i].start();
			System.out.println("DaemonSpawn"+i+" started.");
		}
		for(int i=0;i<t.length;i++){
			System.out.println("t["+i+"] .isDaemon()="+t[i].isDaemon());
		}
		while(true){Thread.yield();}
	}
	
}
class DaemonSpawn implements Runnable{
	private Random r = new Random(47);
	@Override
	public void run() {
//		while(true){ Thread.yield();}
		while(true)
			try {
				TimeUnit.SECONDS.sleep(Long.parseLong(r.nextInt(10)+""));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
}
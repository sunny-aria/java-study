/**
 * 
 */
package study.no21;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 通常只有解决特殊问题时，才用显示的lock对象，例如：用synchronized关键字不能尝试着获取锁
 * 且最终获取锁会失败，或者尝试着获取锁一段时间，然后放弃它，要实现这些，你必须使用concurrent类库
 * AttemptLocking.java
 * @author sunny
 * 2017年4月26日上午8:33:02
 */
public class AttemptLocking {
	private ReentrantLock lock = new ReentrantLock();
	public void untimed(){
		boolean captured = lock.tryLock();
		try{
			System.out.println("tryLock():"+captured);
		}finally{
			if(captured){lock.unlock();}
		}
	}
	public void timed(){
		boolean captured =false;
		try{
			captured = lock.tryLock(2, TimeUnit.SECONDS);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		try{
		System.out.println("tryLock(2,timeUnit.seconds:"+captured);
		}finally{
			if(captured){
				lock.unlock();
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final AttemptLocking al = new AttemptLocking();
		al.untimed();
		al.timed();
		new Thread(){
			{ setDaemon(true);}
			public void run(){
				al.lock.lock();
				System.out.println("acquired");
			}
		}.start();
		Thread.yield();//give the 2nd task a chance
		al.untimed();
		al.timed();
	}

}

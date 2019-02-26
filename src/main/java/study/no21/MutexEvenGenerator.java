/**
 * 
 */
package study.no21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用显示的lock 锁定共享资源
 * MutexEvenGenerator.java
 * @author sunny
 * 2017年4月26日上午8:24:26
 */
public class MutexEvenGenerator extends IntGenerator {
	private int currentEvenValue=0;
	private Lock lock = new ReentrantLock();
	/* (non-Javadoc)
	 * @see study.no21.IntGenerator#next()
	 */
	@Override
	public int next() {
		lock.lock();
		try{
			++currentEvenValue;
			Thread.yield();
			++currentEvenValue;
			return currentEvenValue;
		}finally{
			lock.unlock();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EvenCheck.test(new MutexEvenGenerator());
	}

}

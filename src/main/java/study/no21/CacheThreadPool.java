/**
 * 
 */
package study.no21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用Executor（执行器）管理Thread对象
 * CacheThreadPool.java
 * @author sunny
 * 2017年4月14日上午8:18:50
 */
public class CacheThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i=0;i<3;i++){
			executor.execute(new RunnableImpl());
		}
		executor.shutdown();
	}

}

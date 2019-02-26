/**
 * 
 */
package study.no21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建有限的线程集来执行提交的任务
 * FixedThreadPool.java
 * @author sunny
 * 2017年4月14日上午8:26:39
 */
public class FixedThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(3);
		for(int i=0;i<4;i++){
			exe.execute(new RunnableImpl());
		}
		exe.shutdown();
	}

}

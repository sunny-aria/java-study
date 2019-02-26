/**
 * 
 */
package study.no21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SingleThreadExecutor 就像是 线程数量为1的FixedThreadExecutor，
 * 如果提交了多个任务，这些任务会排队，每个任务在下一个任务开始
 * 之前运行结束，所有的任务将使用相同的线程.
 * 
 * SingleThreadExecutor 会序列化所有提交给它的任务
 * SingleThreadPool.java
 * @author sunny
 * 2017年4月14日上午8:42:30
 */
public class SingleThreadPool {
public static void main(String[] args) {
	ExecutorService exe = Executors.newSingleThreadExecutor();
	for(int i=0;i<4;i++){
		exe.execute(new RunnableImpl());
	}
	exe.shutdown();
}
}

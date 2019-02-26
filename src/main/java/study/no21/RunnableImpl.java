package study.no21;
/**
 * 实现线程Runnable接口，调用yield 方法
 * Thread.yield() 方法 的调用是对线程调度器的一种--建议--，它声明“我已执行完生命周期中最重要 
 * 部分了，此刻可以切换给其他任务执行”
 * RunnableImpl.java
 * @author sunny
 * 2017年4月14日上午8:01:14
 */
public class RunnableImpl implements Runnable {
	private static int taskCount = 0;
	private final int id=taskCount++;
	public RunnableImpl() {
		System.out.println(id+" RunnableImpl Constructor.");
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println(id+" run.");
			Thread.yield();//只是一种建议，可以切换，完全是选择性的
		}
		System.out.println(id+" end.");		
	}

	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			Thread t = new Thread(new RunnableImpl());
			t.start();
		}
	}

}

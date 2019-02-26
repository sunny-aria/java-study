/**
 * 
 */
package study.no21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * EvenCheck.java
 * @author sunny
 * 2017年4月25日上午8:40:06
 */
public class EvenCheck implements Runnable {
	private IntGenerator generator;
	private final int id;
	
	public EvenCheck(IntGenerator generator, int id) {
		this.generator = generator;
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while(!generator.isCanceled()){
			int val = generator.next();
			if(val%2!=0){
				System.out.println( val+" not even!");
				generator.cancel();
			}
		}
	}
	public static void test(IntGenerator gp,int count){
		System.out.println("Presss ctrl+c to exit.");
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<count;i++){
			exec.execute(new EvenCheck(gp, i));
		}
		exec.shutdown();
	}
	public static void test(IntGenerator gp){
		test(gp,10);
	}
}

/**
 * 
 */
package study.no21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * AtomicityTest.java
 * @author sunny
 * 2017年5月8日上午8:10:51
 */
public class AtomicityTest implements Runnable {
	private int i=0;
	public synchronized int getValue(){return i;}
	private synchronized void evenIncrement(){i++;i++;}
	
	
	@Override
	public void run() {
		while(true){
			evenIncrement();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest at = new AtomicityTest();
		exec.execute(at);
		while(true){
			int val = at.getValue();
			if(val%2!=0){//测试程序读到奇数就停止，getValue 运用brain 法则后增加synchronized，不在读到奇数
				System.out.println(val);
				System.exit(0);
			}
		}
	}

}

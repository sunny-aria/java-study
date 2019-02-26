/**
 * 
 */
package study.no21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 
 * SerialNumberChecker.java
 * @author sunny
 * 2017年5月8日上午8:25:53
 */
public class SerialNumberChecker {
	private static final int SIZE =10;
	private static CirclularSet serials = new CirclularSet(1000);
	private static ExecutorService exec = Executors.newCachedThreadPool();
	
	static class SerialChecker implements Runnable{

		@Override
		public void run() {
			while(true){
				int serial = SerialNumberGenerator.nextSerialNumber();
				if(serials.contains(serial)){
					System.out.println("Duplicate:"+serial);
					System.exit(0);
				}
				serials.add(serial);
			}
		}
		
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 * @throws  
	 */
	public static void main(String[] args) throws  Exception {
		for(int i=0;i<SIZE;i++){
			exec.execute(new SerialChecker());//多个线程取数的话，需要保证序列数的唯一
			if(args.length>0){
				TimeUnit.SECONDS.sleep(new Integer(args[0]));
				System.out.println("no duplicates detected");
				System.exit(0);
			}
		}
	}

}
class CirclularSet{
	private int[] array;
	private int len;
	private int index=0;
	public CirclularSet(int size){
		array = new int[size];
		len=size;
		for(int i=0;i<size;i++){
			array[i]=-1;
		}
	}
	public synchronized void add(int i){
		array[index]=i;
		index = ++index%len;
	}
	public synchronized boolean contains(int val){
		for(int i=0;i<len;i++){
			if(array[i]==val)return true;
		}
		return false;
	}
}
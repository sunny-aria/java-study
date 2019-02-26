/**
 * 
 */
package study.no21;

/**
 * join() 方法，一个线程可以在其他线程之上调用join方法，其效果是等待一段时间直到第二个线程结束才继续执行。
 * 如果某个线程在另一个线程上t 上调用t.join()，此线程将被挂起，直到目标线程t结束才恢复（即t.isAlive()返回为假）
 * Joining.java
 * @author sunny
 * 2017年4月24日上午7:54:29
 */
public class Joining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sleeper
			sleepy = new Sleeper("Sleepy",1500),
			grumpy = new Sleeper("Grumpy",1500);
		Joiner
			dopey = new Joiner("Dopey",sleepy),
			doc = new Joiner("Doc",grumpy);
		grumpy.interrupt();//调用线程将被中断执行
		
		
	}

}

class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name,int sleepTime){
		super(name);
		duration = sleepTime;
		start();
	}
	public void run(){
		try{
			sleep(duration);
		}catch(InterruptedException e){
			System.out.println(getName()+" was interrupted. "+" isInterrupted():"+isInterrupted());
			return;
		}
		System.out.println(getName()+" has awakened");
	}
}

class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name,Sleeper sleeper){
		super(name);
		this.sleeper=sleeper;
		start();
	}
	public void run(){
		try {
			sleeper.join();//sleeper 先sleep()被阻塞，后通过join() 等待sleeper醒来
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		System.out.println(getName()+" join completed");
	}
}
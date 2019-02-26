package study.no21;

public class EvenGenerator extends IntGenerator {
	private int currentEvenValue=0;
	@Override
	public synchronized int next() {//使用synchronized 加锁资源
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}
public static void main(String[] args) {
	EvenCheck.test(new EvenGenerator());
}
}

package study.no15.practice.practice25;
/**
 * 一个类，实现了听，看 2个接口
 * Sunny.java
 * @author sunny
 * 2016年12月21日上午8:05:40
 */
public class Sunny implements HearI, SeeI {

	@Override
	public void see() {
		System.out.println("sunny see.");
	}

	@Override
	public void hear() {
		System.out.println("sunny hear.");
	}
}

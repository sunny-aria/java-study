package study.no15.practice.practice41;

public class Mocha extends Coffee {
	private static int counter =0;
	private final int id = counter++;
	@Override
	public String toString() {
		return "Mocha [id=" + id + "]";
	}
	
}

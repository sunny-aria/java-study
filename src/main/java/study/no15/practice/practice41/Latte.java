package study.no15.practice.practice41;

public class Latte extends Coffee {
	private static int counter =0;
	private final int id = counter++;
	@Override
	public String toString() {
		return "Latte "+id;
	}

}

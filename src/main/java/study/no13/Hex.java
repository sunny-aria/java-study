package study.no13;
/**
 * 练习6
 * Hex.java
 * @author sunny
 * 2016年11月18日上午7:11:38
 */
public class Hex {
	private int a=0;
	private long b =0l;
	private float c=0f;
	private double d =0d;
	
	@Override
	public String toString() {
		return String.format("Hex [a= %05d, b=%05d,c=%5.2f, d=%5.2f]", a,b,c,d);
	}


	public static void main(String[] args) {
			System.out.println(new Hex());
	}

}

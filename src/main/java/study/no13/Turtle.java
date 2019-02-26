package study.no13;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * 练习3
 * Turtle.java
 * @author sunny
 * 2016年11月16日上午8:21:51
 */
public class Turtle {
	private String name;
	private Formatter f;
	public Turtle(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}
	
	public void move(int x,int y){
		f.format("%s The Turtle is at(%d,%d) \n", name,x,y);
	}

	public static void main(String[] args) {
		PrintStream outAlias = System.err;
		Turtle t1 = new Turtle("sunny",new Formatter(System.out));
		t1.move(1, 1);
		t1.move(2, 3);
		t1.move(1, 4);
		Turtle t2 = new Turtle("terry",new Formatter(outAlias));
		t2.move(3, 4);
		t2.move(3,7);
		t2.move(3, 8);
	}

}

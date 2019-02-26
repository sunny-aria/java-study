package study.no17;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * 测试priorityQueue
 * Practice11.java
 * @author sunny
 * 2017年2月9日上午8:37:02
 */
public class Practice11 implements Comparable<Practice11>{
	private static Random ran = new Random(47);
	private Integer i = ran.nextInt(100);
	@Override
	public int compareTo(Practice11 o) {
		if(i>o.i) return 1;
		else if(i==o.i) return 0;
		return -1;
	}
	
	@Override
	public String toString() {
		return "Practice11 [i=" + i + "]";
	}

	public static void main(String[] args) {
		PriorityQueue<Practice11> queue = new PriorityQueue<Practice11>();
		for(int i=0;i<10;i++)queue.add(new Practice11());
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}
}

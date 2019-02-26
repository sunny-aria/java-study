package study.no11.practice;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * PriorityQueue 测试
 * Practice28.java
 * @author sunny
 * 2016年11月7日上午7:37:30
 */
public class Practice28 {

	public static void main(String[] args) {
		PriorityQueue<Double> queue = new PriorityQueue<Double>();
		
		Random random = new Random(47);
		
		for(int i=0;i<10;i++){
			queue.offer(random.nextDouble());
		}
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}

}

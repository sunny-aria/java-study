package study.no15.practice.inner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import study.no15.practice.Generators;

/**
 * 大鱼吃小鱼
 * Ocean.java
 * @author sunny
 * 2016年12月15日上午8:01:09
 */
public class Ocean {
	
	public static void eat(BigFish big,LittleFish little){
		System.out.println(big+" eat "+little);
	}
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<BigFish> queue= new LinkedList<BigFish>();
		Generators.fill(queue, BigFish.generator(), 10);
		List<LittleFish> list = new ArrayList<LittleFish>();
		Generators.fill(list, LittleFish.generator, 4);
		for(BigFish b:queue){
			eat(b,list.get(rand.nextInt(list.size())));
		}
	}

}

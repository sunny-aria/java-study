package study.no19;

import java.util.EnumSet;
import static study.no19.AlarmPoints.*;
/**
 * Enumset 使用
 * EnumSets.java
 * @author sunny
 * 2017年4月7日上午7:36:49
 */
public class EnumSets {

	public static void main(String[] args) {
		EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);//empty set
		points.add(BATHROOM);
		System.out.println(points);
		points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
		System.out.println(points);
		points = EnumSet.allOf(AlarmPoints.class);
		points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
		System.out.println(points);
		points.removeAll(EnumSet.range(OFFICE1,OFFICE4));
		System.out.println(points);
		points = EnumSet.complementOf(points);
		System.out.println(points);
		
	}

}

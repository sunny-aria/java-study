/**
 * 
 */
package study.no19;

import java.util.Random;

/**
 * EnumUtils.java 随机产生枚举
 * @author sunny
 * 2017年3月24日上午7:49:31
 */
public class EnumUtils {
	
	public static <T extends Enum<T>> T random(Class<T> enumClass){
		return random(enumClass.getEnumConstants());//使用class.getEnumConstants()方法获取枚举
	}
	private static Random rand = new Random(47);
	public static <T> T random(T[] enumConstants) {
		
		return enumConstants[rand.nextInt(enumConstants.length)];
	}

	public static void main(String[] args) {
		for(int i=0;i<2;i++){
			System.out.println(EnumUtils.random(Explore.class));
		}
	}
}

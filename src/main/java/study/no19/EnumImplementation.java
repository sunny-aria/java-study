/**
 * 
 */
package study.no19;

import java.util.Random;

/**
 * EnumImplementation.java
 * @author sunny
 * 2017年3月24日上午7:29:16
 */
public class EnumImplementation {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			System.out.println(CartoonCharacter.next());
		}
	}

}
enum CartoonCharacter{
	SLAPPY,APANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;
	private static Random rand = new Random(47);
	public static CartoonCharacter next(){
		return values()[rand.nextInt(values().length)];
	}
}
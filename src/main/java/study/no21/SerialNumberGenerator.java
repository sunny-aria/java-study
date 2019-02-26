/**
 * 
 */
package study.no21;

/**
 * SerialNumberGenerator.java
 * @author sunny
 * 2017年5月8日上午8:24:09
 */
public class SerialNumberGenerator {
	private static volatile int serialNumber=0;
	public  synchronized static int nextSerialNumber(){
		return serialNumber++;
	}
	
}

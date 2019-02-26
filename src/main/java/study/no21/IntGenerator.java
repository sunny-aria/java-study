/**
 * 
 */
package study.no21;

/**
 * int 生成器
 * IntGenerator.java
 * @author sunny
 * 2017年4月25日上午8:36:14
 */
public abstract class IntGenerator {
	private volatile	boolean canceled=false;
	public abstract int next();
	public void cancel(){canceled=true;}
	public boolean isCanceled(){
		return canceled;
	}
}

/**
 * 
 */
package study.no20;

import org.junit.Test;

/**
 * 栈单元测试
 * StackStringTest.java
 * @author sunny
 * 2017年4月12日上午7:39:04
 */
public class StackStringTest extends StackL<String>{
	
	@Test
	public void _push(){
		push("one");
		assert top().equals("one");
		push("two");
		assert top().equals("two");
	}
	
	@Test
	public void _pop(){
		push("one");
		push("two");
		assert pop().equals("two");
		assert pop().equals("one");
	}
	
	@Test
	public void _top(){
		push("one");
		push("two");
		assert top().equals("two");
		assert top().equals("two");
	}
	
}

package study.no11.practice;
/**
 * 自定义堆栈测试
 * StackVoTest.java
 * @author sunny
 * 2016年11月4日上午8:22:56
 */
public class StackVoTest {
	public static void main(String[] args) {
		StackVo<String> stack = new StackVo<String>();
		for(String a:"a b c d e f".split(" ")){
			stack.push(a);
		}
		
		while(!stack.empty()){
			
		System.out.println(	stack.pop());
		}
	}
}

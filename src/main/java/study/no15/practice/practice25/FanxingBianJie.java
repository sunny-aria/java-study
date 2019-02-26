package study.no15.practice.practice25;
/**
 * 测试泛型边界
 * FanxingBianJie.java
 * @author sunny
 * 2016年12月21日上午8:08:13
 */
public class FanxingBianJie {

	public static <T extends HearI> void f(T t){
		t.hear();
	}
	public static  <T extends SeeI> void g(T t){
		t.see();
	}
	
	public static void main(String[] args) {
		Sunny sunny = new Sunny();
		f(sunny);
		g(sunny);
	}

}

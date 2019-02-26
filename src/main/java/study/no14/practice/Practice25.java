package study.no14.practice;
/**
 * 测试通过反射操作类的成员属性和成员方法
 * Practice25.java
 * @author sunny
 * 2016年12月7日上午8:45:43
 */
public class Practice25 {
	private int a=0;
	private final String b ="can u change me?";
	protected String c ="can u change c?";
	protected int dd =1;
	private String f(String d){
		return d;
	}
	
	protected String g(String e){
		return e;
	}
	
	String h(String f){
		return f;
	}

	@Override
	public String toString() {
		return "Practice25 [a=" + a + ", b=" + b + ", c=" + c + ", dd=" + dd + "]";
	}

	
	


}

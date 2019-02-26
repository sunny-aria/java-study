package study.no14.practice;

import java.lang.reflect.Method;

/**
 * 利用RTTI ,不改变基类的情况下，调用子类的方法
 * Practice26.java
 * @author sunny
 * 2016年12月8日上午7:45:43
 */
public class Practice26 {

	public static void main(String[] args) throws Exception {
		Instrument[] ins = {new Wind(),new Percussion(),new Instrument()};
		for(Instrument in:ins){
			if(in instanceof Wind){//有特殊要求的子类，可以通过RTTI 的方式来检查特定的类型
				Method m = in.getClass().getDeclaredMethod("clearSpitValue");
				m.invoke(in);
			}
			in.run();
		}
	}

}
class Instrument{
	
	void run(){
		System.out.println(" instrument run.");
	}
	
}

class Wind extends Instrument{
	void run(){
		System.out.println(" Wind run.");
	}
	
	void clearSpitValue(){
		System.out.println( "Wind clear spit value.");
	}
}

class Percussion extends Instrument{
	void run(){
		System.out.println(" Percussion run.");
	}
}
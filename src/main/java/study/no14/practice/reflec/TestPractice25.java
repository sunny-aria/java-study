package study.no14.practice.reflec;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import study.no14.practice.Practice25;

public class TestPractice25 {
	
	
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		Practice25 p25 =new Practice25();
		
		Field fa = p25.getClass().getDeclaredField("a");
		fa.setAccessible(true);
		System.out.println(fa.getInt(p25));
		fa.setInt(p25, 47);
		System.out.println(p25);
		System.out.println("---------------------");
		 Field fb =p25.getClass().getDeclaredField("b");
		fb.setAccessible(true);
		System.out.println(fb.get(p25));
		fb.set(p25, "I change b");
		System.out.println(p25);
		System.out.println("---------------------");
		Field fc = p25.getClass().getDeclaredField("c");
		fc.setAccessible(true);
		System.out.println(fc.get(p25));
		fc.set(p25, "I change c");
		System.out.println(p25);
		System.out.println("---------------------");
		Field fdd = p25.getClass().getDeclaredField("dd");
		fdd.setAccessible(true);
		System.out.println(fdd.get(p25));
		fdd.set(p25,48);
		System.out.println(p25);
		System.out.println("---------------------");
		
		Method mf = p25.getClass().getDeclaredMethod("f",String.class);
		mf.setAccessible(true);
		System.out.println(mf.invoke(p25, "sunny f"));
		Method mg = p25.getClass().getDeclaredMethod("g",String.class);
		mg.setAccessible(true);
		System.out.println(mg.invoke(p25, "sunny g"));
		
		Method mh = p25.getClass().getDeclaredMethod("h",String.class);
		mh.setAccessible(true);
		System.out.println(mh.invoke(p25, "sunny h"));
	}

}

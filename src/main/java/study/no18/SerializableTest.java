package study.no18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化，反序列对象
 * SerializableTest.java
 * @author sunny
 * 2017年3月15日上午8:37:01
 */
public class SerializableTest {
	public static  class Apple implements Serializable{
		String name;
		public Apple(String name){
			this.name=name;
		}
		public String toString(){
			return this.name;
		}
		
	}
	public static void main(String[] args) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("seriz.out"));
			Apple apple = new Apple("orange");
			out.writeObject("test serializable.");
			out.writeObject(apple);
			out.flush();
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("seriz.out"));
			String s = (String)in.readObject();
			System.out.println(s);
			Apple a = (Apple)in.readObject();
			System.out.println(a);
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}


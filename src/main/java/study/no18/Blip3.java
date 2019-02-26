/**
 * 
 */
package study.no18;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 有参构造器 ，Externalizable 接口使用
 * Blip3.java
 * @author sunny
 * 2017年3月16日上午8:05:10
 */
public class Blip3 implements Externalizable{
	private int i;
	private String s;
	
	
	public Blip3() {
		super();
		System.out.println("Blip3 constructor");
	}

	public Blip3(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Blip3 writeExternal:");
		out.writeObject(s);
		out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("Blip3 readExternal:");
		s = (String) in.readObject();//一些属性可以不反序列化
		i = in.readInt();//一些属性可以不反序列化，需要在readExternal 时注释掉
	}
	
	@Override
	public String toString() {
		return "Blip3 [i=" + i + ", s=" + s + "]";
	}

	public static void main(String[] args) {
		Blip3 b3 = new Blip3(47,"A string");
		System.out.println(b3);
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Blip3.out"));
			System.out.println("saving b3:");
			o.writeObject(b3);
			o.close();
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Blip3.out"));
			System.out.println("Recovering b3:");
			b3 = (Blip3) in.readObject();
			System.out.println(b3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

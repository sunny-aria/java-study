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
 *  Externalizable  接口测试
 * BlipCheck.java
 * @author sunny
 * 2017年3月16日上午7:43:57
 */
public class BlipCheck {
	public static void main(String[] args) throws IOException, Exception {
		System.out.println("Constructor objects:");
		Blip1 b1 = new Blip1();
		Blip2 b2 = new Blip2();
		
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("blips.out"));
		System.out.println("saving objects:");
		o.writeObject(b1);
		o.writeObject(b2);
		o.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("blips.out"));
		System.out.println("recovering b1:");
		b1 = (Blip1) in.readObject();
		System.out.println("recovering b2:");
		b2 = (Blip2) in.readObject();
		
	}

}
class Blip1 implements Externalizable{
	public Blip1(){
		System.out.println("Blip1 constructor");
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Blip1 writeExternal");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("Blip1 readExternal");
	}
}

class Blip2 implements Externalizable{
	public Blip2(){//具象化时externalizable 接口所有默认构造器都会被调用，构造器必须是public
		System.out.println("Blip2 constructor");
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("blip2 readExternal");
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("blip2 witerExternal");
	}
	
}
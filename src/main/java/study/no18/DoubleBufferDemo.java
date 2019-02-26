package study.no18;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

/**
 * 缓冲器的分配，读取
 * DoubleBufferDemo.java
 * @author sunny
 * 2017年3月10日上午8:01:34
 */
public class DoubleBufferDemo {

	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(1024);//分配后，缓冲器中数据自动置零
		DoubleBuffer db = bb.asDoubleBuffer();
		//store an array of double
		db.put(new double[]{1.0,2.0,11,42,47,99,143});
		System.out.println(db.get(3)+"--old--");
		db.put(3, 1355);//重新赋值
		db.flip();
		while(db.hasRemaining()){
			double d = db.get();
			System.out.println(d);
		}
	}

}

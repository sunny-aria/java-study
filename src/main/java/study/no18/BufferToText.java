package study.no18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/**
 * 使用charBuffer 放入字符
 * BufferToText.java
 * @author sunny
 * 2017年3月9日上午8:15:10
 */
public class BufferToText {
	public static void test()throws IOException{
		FileChannel fc = new FileOutputStream("data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(24);
		buff.asCharBuffer().put("some text");
		fc.write(buff);
		fc.close();
		fc = new FileInputStream("data.txt").getChannel();
		fc.read(buff);
		buff.flip();//将position 置为0，limit 置为position，用于读取缓冲器
		System.out.println(buff.asCharBuffer());
		fc.close();
	}
	
	public static void main(String[] args) throws IOException {
		ByteBuffer buff = ByteBuffer.allocate(24);
		buff.asCharBuffer().put("sunny test");
		buff.rewind();//倒回数据开始的部分
		char c;
		while((c=buff.getChar())!=0){
			System.out.println(c);
		}
		
	}

}

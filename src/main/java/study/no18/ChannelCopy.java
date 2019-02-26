package study.no18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/**
 * nio 通道，缓冲器,
 * 将数据读入缓冲器，将缓冲器在通道间传递
 * ChannelCopy.java
 * @author sunny
 * 2017年3月9日上午7:44:08
 */
public class ChannelCopy {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws IOException {
		if(args.length!=2){
			System.out.println("arguments: sourcefile destfile");
			System.exit(1);
		}
		FileChannel in =new FileInputStream(args[0]).getChannel(),
				out = new FileOutputStream(args[1]).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		while(in.read(buffer)!=-1){
			buffer.flip();//准备写操作
			out.write(buffer);
			buffer.clear();//准备读操作
		}
		in.close();
		out.close();
	}

}

package study.no18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * 文件的转换
 * TransferTo.java
 * @author sunny
 * 2017年3月9日上午7:55:46
 */
public class TransferTo {

	public static void main(String[] args) throws IOException {
		if(args.length!=2){
			System.out.println("arguments:sourcefile destfile");
			System.exit(1);
		}
		FileChannel in = new FileInputStream(args[0]).getChannel(),
				out = new FileOutputStream(args[1]).getChannel();
		in.transferTo(0, in.size(), out);
		//Or:
//		out.transferFrom(in, 0, in.size());
	}

}

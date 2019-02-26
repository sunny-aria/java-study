package study.no18;

import java.io.IOException;
import java.io.StringReader;

/**
 * StringReader 使用
 * MemoryInput.java
 * @author sunny
 * 2017年3月2日上午8:29:38
 */
public class MemoryInput {

	public static void main(String[] args) {
		try {
			StringReader sr = new StringReader(BufferedInputFile.read("D:\\workspace\\study\\src\\study\\no18\\DirList.java"));
			int c ;
			while((c=sr.read())!=-1){
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

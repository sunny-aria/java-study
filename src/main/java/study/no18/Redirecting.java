package study.no18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
/**
 * IO重定向操作的是字节流，
 * system.setIn(inputStream)
 * system.setOut(PrintStream)
 * system.setErr(PrintStream)
 * 静态方法，对输入，输出，错误流进行重定向
 * Redirecting.java
 * @author sunny
 * 2017年3月7日上午8:24:45
 */
public class Redirecting {

	public static void main(String[] args) throws IOException {
		PrintStream console = System.out;
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("text.txt"));
		PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s ;
		while((s=br.readLine())!=null)
			System.out.println(s);
		out.close();//!!!!记住关闭
		System.setOut(console);
	}

}

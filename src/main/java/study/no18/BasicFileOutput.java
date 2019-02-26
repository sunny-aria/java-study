package study.no18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.LinkedList;

/**
 * 基本文件输出
 * BasicFileOutput.java
 * @author sunny
 * 2017年3月3日上午7:56:29
 */
public class BasicFileOutput {

	static String file ="basicFileoutput.out";
	
	public static void writer() throws IOException{
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("d:/workspace/study/src/study/no18/BufferedInputFile.java")));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		PrintWriter out = new PrintWriter(file);//可以查看内部实现
		int lineNo=1;
		String s;
		while((s=in.readLine())!=null){
			out.println(lineNo+++" :"+s);
		}
		out.close();
		in.close();
		System.out.println(BufferedInputFile.read(file));
	}
	
	public static void practice12() throws IOException{
		LinkedList<String> list = BufferedInputFile.read1("d:/workspace/study/src/study/no18/BufferedInputFile.java");
		PrintWriter out = new PrintWriter(file);//可以查看内部实现
		int lineNo=1;
		String s;
		for(int i=0;i<list.size();i++){
			out.println(lineNo++ +":"+list.get(i));
		}
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
	
	public static void practice13() throws IOException{
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("d:/workspace/study/src/study/no18/BufferedInputFile.java")));
		LineNumberReader lnr = new LineNumberReader(in);//使用lineNumberReader 获取行号
		PrintWriter out = new PrintWriter(file);//可以查看内部实现
		String s;
		while((s=lnr.readLine())!=null){
			out.println(lnr.getLineNumber()+" :"+s);
		}
		out.close();
		lnr.close();
		System.out.println(BufferedInputFile.read(file));
	}
	
	public static void main(String[] args) throws IOException {
//		writer();
//		practice12();
		practice13();
	}

}

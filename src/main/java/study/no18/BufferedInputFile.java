package study.no18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * 缓冲输入文件
 * BufferedInputFile.java
 * @author sunny
 * 2017年3月2日上午8:08:38
 */
public class BufferedInputFile {
	public static String read(String filename)throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s=in.readLine())!=null){
			sb.append(s).append("\n");
		}
		in.close();
		return sb.toString();
	}

	public static LinkedList<String> read1(String filename)throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		LinkedList<String> list = new LinkedList<String>();
		while((s=in.readLine())!=null){
			list.add(s);
		}
		in.close();
		return list;
	}
	
	public static void main(String[] args) throws IOException {
//		System.out.println(read("D:\\workspace\\study\\src\\study\\no18\\DirList.java"));
		LinkedList<String> list = read1("D:\\workspace\\study\\src\\study\\no18\\DirList.java");
		for(int i =list.size();i>0;){
			System.out.println(list.get(--i));
		}
		System.out.println();
	}

}

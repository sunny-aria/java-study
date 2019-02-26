package study.no18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
/**
 * 文件读写
 * TextFile.java
 * @author sunny
 * 2017年3月6日上午8:13:59
 */
public class TextFile extends ArrayList<String> {
	public static String read(String fileName){
		StringBuilder sb = new StringBuilder();
		try{
			BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsolutePath()));
			try{
				String s;
				while((s=in.readLine())!=null){
					sb.append(s).append("\n");
				}
			}finally{
				in.close();
			}
		}catch(IOException e){
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
	
	public static void write(String filename,String text){
		try {
			PrintWriter out = new PrintWriter(new File(filename).getAbsolutePath());
			try{
				out.print(text);
			}finally{
				out.close();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}


	public TextFile(String filename,String splitter){
		super(Arrays.asList(read(filename).split(splitter)));
		if(get(0).equals(""))remove(0);
	}
	
	public TextFile(String filename){
		this(filename, "\n");
	}
	public void write(String filename){
		try{
			PrintWriter out = new PrintWriter(new File(filename).getAbsolutePath());
			try{
				for(String item:this){
					out.println(item);
				}
			}finally{
				out.close();
			}
		}catch(IOException e){
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		String file = read("d:/workspace/study/src/study/no18/TextFile.java");
		write("text.txt",file);
		TextFile text = new TextFile("text.txt");
		text.write("text2.txt");
		TreeSet<String> words = new TreeSet<String>(
				new TextFile("text2.txt","\\W+"));
		System.out.println(words.headSet("a"));
	}
	
}
package study.no13.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice15 {

	public static  void practice15(String regx,BufferedReader br,int model) throws IOException{
		Pattern p = Pattern.compile(regx, model);
		Matcher m = p.matcher("");
		int index=0;
		while(br.readLine()!=null){
			m.reset(br.readLine());
			while(m.find()){
				System.out.println(index++ +": "+m.group()+": "+m.start());
			}
		}
	}
	
	public void practice15(String regx,File br,int model) throws IOException{
		Pattern p = Pattern.compile(regx, model);
		Matcher m = p.matcher("");
		int index=0;
		File[] file = br.listFiles();
		//再读取每个文件的内容
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));
		practice15("\\s*\\w*\\b*",br,Pattern.MULTILINE);

	}

}

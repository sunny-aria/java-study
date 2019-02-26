package study.no13.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 练习10
 * Practice10.java
 * @author sunny
 * 2016年11月21日上午8:20:20
 */
public class Practice10 {
	public static void main(String[] args) {
		String s="Java now has regular expressions";
		
		String[] regs = {"^Java","\\breg.*","\\Breg.*","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}.","s{0,3}"};
		for(String reg:regs){
			Pattern p= Pattern.compile(reg);
			Matcher m = p.matcher(s);
			while(m.find()){
				System.out.println("reg: "+reg+" match "+m.group()+" at positions "+ m.start()+" - "+(m.end()-1));
			}
		}
		
		
	}
}

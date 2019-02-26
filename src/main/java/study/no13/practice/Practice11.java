package study.no13.practice;

import java.util.regex.Pattern;

public class Practice11 {

	public static void main(String[] args) {
		String reg = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		String s = "Arline are eight apples and one orange while Anita hadn't any";
//		Pattern p = Pattern.compile(reg);
		boolean b = Pattern.matches(reg, s);
		System.out.println(b);
	}

}

package study.no13;

import java.util.regex.Pattern;
/**
 * 使用Pattern 练习正则表达式
 * PatternTest.java
 * @author sunny
 * 2016年11月18日上午8:01:48
 */
public class PatternTest {

	public static void main(String[] args) {
		String pattern = "^[A-Z]+(\\s|\\w)+\\.$"; //匹配以大写字母开头，句号结尾，中间不管出现\s(空白）|\w(字符）多少
		String word = "Sun dong feng test pattern word.";
		boolean flag = Pattern.matches(pattern, word);
		System.out.println(flag);
	}

}

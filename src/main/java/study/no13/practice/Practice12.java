package study.no13.practice;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 找出不以大写字母开头的词
 * Practice12.java
 * @author sunny
 */
public class Practice12 {
	static public final String POEM=
			"Twas brilling, and the slithy toves\n"
			+" Did gyre and gimble in the wabe.\n"
			+ "All mimsy were the borogoves,\n"
			+ "And the mome raths outgrabe.\n\n"
			+ "Beware the Jabberwock, my son,\n"
			+ "The jaws tat bite,the claws that catch.\n"
			+ "Beware the Jubjub bird, and shun\n"
			+ "The frumious Bandersnatch. "		;
	public static void main(String[] args) {
		String regx = "\\s+([^A-Z][a-z]*)\\b*";
		Matcher m = Pattern.compile(regx).matcher(POEM);
		Set<String> set = new LinkedHashSet<String>();
		while(m.find()){
			set.add(m.group());
		}
		System.out.println(set);
	}

}

package study.no13.practice;

import java.util.Arrays;

public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This!!unusual use!!of exclamation!!points";
		
		System.out.println(Arrays.asList(input.split("!!")));
		System.out.println(Arrays.asList(input.split("!!",3)));
	}

}

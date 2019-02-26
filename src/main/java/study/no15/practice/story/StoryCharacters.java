package study.no15.practice.story;
/**
 * 电影演员
 * StoryCharacters.java
 * @author sunny
 * 2016年12月13日上午7:26:43
 */
public class StoryCharacters {
	private static long counter=0;
	private final long id = counter++;
	public String toString(){
		return getClass().getSimpleName()+" "+id;
	}
}

package study.no9.adapterInterface;
/**
 *  我们可以在任何现有类上添加新的接口，
 *  所以这意味着让方法接受接口类型，
 *  是让任何类都可以对该方法进行适配的方式
 * @author sdf
 * 2016-10-26 6:55
 */
public class CharaterUtil {
	public char[] getCharArr(String s){
		return s.toCharArray();
	}
}

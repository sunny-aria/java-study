package study.no18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 文件过滤器
 * DirList.java
 * @author sunny
 * 2017年2月24日上午7:58:11
 */
public class DirList {
	public static FilenameFilter filter(final String regex){
		return new FilenameFilter(){
			private Pattern pattern = Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		};
	}
	
	public static void main(String[] args) {
		File path = new File("d:/workspace/study/src/study/no17");
		String[] list;
		if(args.length==0)
			list = path.list();
		else
			list = path.list(filter(args[0]));
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list){
			System.out.println(dirItem);
		}
	}

}

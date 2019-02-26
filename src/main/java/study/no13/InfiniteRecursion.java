package study.no13;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
	
	public String toString(){
//		return " InfiniteRecursion address:"+this.toString()+" \n";
		return " InfiniteRecursion address:"+super.toString()+" \n"; //打印地址，使用super.toString()方法
	}
	
	public static void main(String[] args) {
		List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>();
		for(int i=0;i<10;i++){
			list.add(new InfiniteRecursion());
		}
		System.out.println(list);
	}

}

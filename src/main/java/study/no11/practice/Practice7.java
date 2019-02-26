package study.no11.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice7 {
	class P7{
	String name;
	P7(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
	}
	public static void main(String[] args) {
		Practice7 p = new Practice7();
		List<Practice7.P7> list = new ArrayList<Practice7.P7>();
		for(int i=0;i<10;i++){
			Practice7.P7 p7=p.new P7("name"+i); 
			list.add(p7);
		}
		List<Practice7.P7> subList = list.subList(2,5);
		
		list.removeAll(subList);
		
		System.out.println(list);
	}
	
}

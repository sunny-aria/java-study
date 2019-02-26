package study.no17;

import java.util.PriorityQueue;
/**
 * 优先级队列，每个对象包含一个字符串和一个主要的以及次要的优先级值
 * ToDoList.java
 * @author sunny
 * 2017年2月9日上午8:26:31
 */
public class ToList extends PriorityQueue<ToList.ToDoItem> {

	public static class ToDoItem implements Comparable<ToDoItem>{
		private char primary;
		private int secondary;
		private String item;
		
		public ToDoItem(char primary, int secondary, String item) {
			this.primary = primary;
			this.secondary = secondary;
			this.item = item;
		}

		@Override
		public int compareTo(ToDoItem o) {
			if(primary>o.primary)return +1;
			if(primary==o.primary){
				if(secondary>o.secondary)
					return 1;
				else if(secondary==o.secondary)
					return 0;
			}
			return -1;
		}
		public String toString(){
			return Character.toString(primary)+secondary+": "+item;
		}
	}

	public void add(String td,char pri,int sec){
		super.add(new ToDoItem(pri,sec,td));
	}
	public static void main(String[] args) {
		ToList todoList = new ToList();
		todoList.add("Empty trash",'C',4);
		todoList.add("Feed dog",'A',2);
		todoList.add("Fedd bird",'B',7);
		todoList.add("Mow lawn",'C',3);
		todoList.add("Water lawn",'A',1);
		todoList.add("Feed cat",'B',1);
		while(!todoList.isEmpty()){
			System.out.println(todoList.remove());
		}
	}

}

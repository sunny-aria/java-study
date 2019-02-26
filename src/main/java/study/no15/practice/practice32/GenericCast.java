package study.no15.practice.practice32;

import java.util.ArrayList;
import java.util.List;

public class GenericCast {

	public static void main(String[] args) {
		int size =10;
		/*FixedSizeStack<String> strings = new FixedSizeStack(size);
		for(String s:"A B C D E F G H J K I L M N".split(" ")){
			strings.push(s);//没有边界检查，会出现异常
		}
		for(int i=0;i<size;i++){
			System.out.print(strings.pop()+" ");
		}*/
		System.out.println("----------------------------");
		FixedSizeStack1<String> stringss = new FixedSizeStack1();
		for(String s:"A B C D E F G H J K I L M N".split(" ")){
			stringss.push(s);
		}
		for(int i=0;i<size;i++){
			System.out.print(stringss.pop()+" ");
		}
	}

}
class FixedSizeStack<T>{
	private int index=0;
	private Object[] storage;
	public FixedSizeStack(int size){
		storage = new Object[size];
	}
	public void push(T item){storage[index++]=item;}
	@SuppressWarnings("unchecked")
	public T pop(){return (T) storage[--index];}
}
class FixedSizeStack1<T>{
	private int index=0;
	private List<T> storage;
	public FixedSizeStack1(){
		storage = new ArrayList<T>();
	}
	public void push(T item){storage.add(item); index++;}
	@SuppressWarnings("unchecked")
	public T pop(){return storage.get(--index);}
}

package study.no15.practice;
/**
 * 利用泛型，自己实现一个堆栈类，
 * 元素压入时，当前元素变为栈顶
 * 元素出栈时，栈顶元素下移
 * LinkedStack.java
 * @author sunny
 * 2016年12月9日上午8:18:50
 */
public class LinkedStack<T> {
	private static class Node<T>{//内部类可以访问外部类的类型参数
		T item;//当前元素
		Node<T> next;
		Node(){item=null;next=null;}
		Node(T item,Node<T> next){
			this.item=item;
			this.next=next;
		}
		//判断是否空栈
		boolean end(){return item==null&&next==null;}
	}
	
	private Node<T> top = new Node<T>();
	
	public void push(T item){
		top = new Node<T>(item,top);//压入堆栈时，当前元素变成栈顶，next指向上次压入的元素
	}
	
	public T pop(){
		T result = top.item;//出栈时，当前元素出栈
		if(!top.end()){
			top = top.next; //出栈后，next 变为栈顶
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<String>();
		for(String item:"sunny test linked stack".split(" ")){
			stack.push(item);
		}
		String s ;
		while((s=stack.pop())!=null){
			System.out.println(s);
		}
	}

}

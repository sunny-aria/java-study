package study.no9;

public class B extends C{
	public void print(){
		System.out.println("B");
	}
	public static void printC(C c){
		printC(c);
	}
	
	public static void main(String[] args) {
		printC(new B());
	}
	@Override
	void printB(C c) {
printC(c);		
	}
}

abstract class C{
	abstract void printB(C c);
}
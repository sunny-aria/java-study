package study.no14.practice;

public class Practice1 {
	static void printInfo(Class cc){
		System.out.println("className:"+cc.getName()+" is interface?["+cc.isInterface()+"]");
		System.out.println("simpleName:"+cc.getSimpleName());
		System.out.println("Canonical name:"+cc.getCanonicalName());
		System.out.println("#################################");
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c =Class.forName("study.n14.practice.FancyToy");
		} catch (ClassNotFoundException e) {
			System.err.println("study.n14.practice.FancyToy can't find.");
			System.exit(1);
		}
		printInfo(c);
		for(Class face : c.getInterfaces()){
			printInfo(face);
		}
		
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.err.println("can't instance.");
			System.exit(1);
		}
		printInfo(obj.getClass());
		
	}

}

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface Practice2{} //练习2，增加新的接口类
class Toy{
//	Toy(){} //练习1，去掉默认构造方法，看newInstance 是否报错。
	Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
	public FancyToy() {
		super(1);
	}
}

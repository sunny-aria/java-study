package study.no10.inner.practice26;

public class BigEgg2 extends Egg2 {
	public class Yolk extends Egg2.Yolk{
		public Yolk(){ System.out.println("BigEgg2.Yolk");}
		public void f(){System.out.println("BigEgg2.Yolk.f()");}
	}
	public BigEgg2(){insertYolk(new Yolk());}
	
	public static void main(String[] args) {
		Egg2 be = new BigEgg2();
		be.g();
		System.out.println("-------------");
		Egg2 eg = new Egg2();
		/*
		 * 初始化步骤
		 * 1.先父类的成员变量的初始化
		* 2.再父类的构造器
		* 3.再导出类的成员变量初始化
		* 4.再导出类的构造器
		*/
	}
}

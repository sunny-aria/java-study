package study.no10.inner.practice26;
/**
 * 内部类可以覆盖么？
 * Egg2.java
 * @author sunny
 * 2016年11月2日上午7:16:40
 */
public class Egg2 {
	protected class Yolk{
		public Yolk(){System.out.println("Egg2.Yolk");}
		public void f(){System.out.println("Egg2.Yolk.f()");}
	}
	private Yolk y = new Yolk();
	public Egg2(){
		System.out.println("new Egg2");
	}
	public void insertYolk(Yolk yy){this.y=yy;}
	public void g(){y.f();}
}

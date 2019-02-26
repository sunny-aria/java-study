package study.no9;
/**
 *  1.先逐层调用父类构造
 *  2. 调用初始化变量
 *  3. 调用导出类构造方法
 * @author sdf
 *
 */
public class Sanwich extends PortableLunch {
	public Sanwich() {
		System.out.println("Sanwich()");
	}
	Bread bread = new Bread();
	Cheese cheese = new Cheese();
	Lettuce let = new Lettuce();
	public static void main(String[] args) {
		new Sanwich();
		
	}

}
class Meal{
	Meal(){
		System.out.println("Meal()");
	}
}
class Bread{
	Bread(){
		System.out.println("Bread()");
	}
}
class Cheese{
	Cheese(){
		System.out.println("Cheese()");
	}
}
class Lettuce{
	Lettuce(){
		System.out.println("Lettuce()");
	}
}
class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch()");
	}
}
class  PortableLunch extends Lunch{
	PortableLunch(){
		System.out.println("PortableLunch()");
	}
}

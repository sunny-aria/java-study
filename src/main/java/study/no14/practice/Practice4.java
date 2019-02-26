package study.no14.practice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Practice4 {

	public static void rotete(Shape shape){
		if(shape instanceof Circle){
			shape.draw();
		}//练习5
	}
	public static void main(String[] args) {
		
		Shape c = new Circle();
		/*Square s= (Square) c;
		s.draw();//练习3
*/		
		if(c instanceof Square){
			Square ss= (Square) c;
			ss.draw();//练习4
		}else{
			c.draw();
		}
		System.out.println("---练习5---");
		rotete(c);//练习5
		
		
		List<Shape> shapes = Arrays.asList(new Circle(),new Square(),new  Riangle() );
		
		for(Shape shape:shapes){
			shape.draw();
		}
		System.out.println("-----练习6------");//区分类型，设置标识
		List<Shape> shapess = Arrays.asList(new Circle(1),new Square(2),new  Riangle(3) );
		
		for(Shape shape:shapess){
			shape.draw();
		}
		System.out.println("---------练习9--------");
		Circle c9=new Circle();
		Class claz = c9.getClass();
		for(Class in:claz.getInterfaces()){
			System.out.println(in.getName());
		}
		Class sdf = claz.getSuperclass();
		System.out.println(sdf.getName());
		Field [] fields = claz.getDeclaredFields();
		for(Field f:fields){
			System.out.println(f.getName());
		}
		Method[] ms = claz.getDeclaredMethods();
		for(Method m:ms){
			System.out.println(m.getName());
		}
	}

}
abstract class Shape{
	void draw(){ System.out.println(this+".draw()");}
	abstract public String toString();
	int flag;
}
class Circle extends Shape{
	public Circle() {
	}
	public Circle(int flag) {
		this.flag=flag;
	}
	@Override
	public String toString() {
		
		return "Circle"+flag;
	}
	
}
class Square extends Shape{
	public Square() {
	}
	public Square(int flag) {
		this.flag=flag;
	}
	@Override
	public String toString() {
		
		return "Square"+flag;
	}
}
class Riangle extends Shape{
	public Riangle() {
	}
	public Riangle(int flag) {
		this.flag=flag;
	}
	@Override
	public String toString() {
		
		return "Riangle"+flag;
	}
	
}
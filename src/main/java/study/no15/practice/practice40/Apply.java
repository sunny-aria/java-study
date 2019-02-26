package study.no15.practice.practice40;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 缺乏潜在类型机制的补偿
 * Apply.java
 * @author sunny
 * 2017年1月5日上午8:09:28
 */
public class Apply {
	public static <T,S extends Iterable<? extends T>> void apply(S seq,Method f ,Object... arg){
		try{
			for(T t:seq){
				f.invoke(t, arg);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		for(int i=0;i<10;i++){
			shapes.add(new Shape());
		}
		try {
			Apply.apply(shapes, Shape.class.getMethod("rotate"));
			Apply.apply(shapes, Shape.class.getMethod("resize",int.class),5);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		List<Square> squares = new ArrayList<Square>();
		for(int i=0;i<10;i++){
			squares.add(new Square());
		}
		try {
			Apply.apply(squares, Square.class.getMethod("rotate"));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		try {
			Apply.apply(new FilledList(Shape.class, 10), Shape.class.getMethod("rotate"));
			Apply.apply(new FilledList(Square.class, 10),Shape.class.getMethod("rotate"));
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
 class Shape{
	public void rotate(){System.out.println(this+" rotate");}
	public void resize(int newSize){System.out.println(this+" resize "+newSize);}
}
class Square extends Shape{}

class FilledList<T> extends ArrayList<T>{
	public FilledList(Class<? extends T> type,int size){
		try{
			for(int i=0;i<size;i++){
				add(type.newInstance());
			}
		}catch(Exception e){ throw new RuntimeException(e);}
	}
}
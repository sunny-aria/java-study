package study.no15.practice.practice21;

import java.util.HashMap;
import java.util.Map;

class Building{}
class House extends Building{}

/**
 * 擦除的补偿，引入类型标签
 * ClassTypeCapture.java
 * @author sunny
 * 2016年12月19日上午8:43:03
 * @param <T>
 */
public class ClassTypeCapture<T> {
	Class<T> kind;//引入类型标签
	Map<String,Class<?>> map=new HashMap<String,Class<?>>();
	public ClassTypeCapture(Class<T> kind){
		this.kind=kind;
	}
	public boolean f(Object arg){
		return kind.isInstance(arg);
	}
	
	public  void addType(String typename,Class<?> kind){
		map.put(typename, kind);
	}
	
	public  Object creattNew(String typename) throws InstantiationException, IllegalAccessException{
		Class<?> t = map.get(typename);
		return t.newInstance();
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<Building>(Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
		
		ctt1.addType("building", Building.class);
		System.out.println(ctt1.creattNew("building"));
	}

}

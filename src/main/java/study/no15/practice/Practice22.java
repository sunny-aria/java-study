package study.no15.practice;

/**
 * 类型擦除的补偿，引入类型标签+反射，要求引入的类型类具有默认的构造器
 * Practice22.java
 * @author sunny
 * 2016年12月20日上午7:26:48
 */
public class Practice22<T> {
	Class<T> type;
	public Practice22(Class<T> type){
		this.type=type;
	}
	
	public T newObj(){
		try {
			return type.newInstance();//使用newInstance() 类型必须有默认的构造器
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		};
		return null;
	}
	
	public static void main(String[] args) {
		Practice22<Employee> p22 = new Practice22<>(Employee.class);
		System.out.println(p22.newObj());
	}

}

class Employee{
	private int a;
	public Employee(int a){
		this.a=a;
	}
}
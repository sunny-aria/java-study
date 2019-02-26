package study.no14.practice.typinfo;
/**
 * 练习11
 * Person.java
 * @author sunny
 * 2016年11月29日上午8:24:12
 */
public class Pet {
	String name;
	String id;
	public Pet(String name){this.name=name;}
	public Pet(){}                 
	@Override
	public String toString() {
		return  name==null?this.getClass().getSimpleName():name;
	}
}
class Dog extends Pet{
	public Dog(String name){super(name);}
	public Dog(){super();}
}

class Mutt extends Dog{
	public Mutt() {
		super();
	}
	public Mutt(String name) {
		super(name);
	}
}

class Pug extends Dog{

	public Pug() {
		super();
		
	}

	public Pug(String name) {
		super(name);
		
	}
	
}

class Cat extends Pet{

	public Cat() {
		super();
		
	}

	public Cat(String name) {
		super(name);
		
	}
	
}

class Manx extends Cat{

	public Manx() {
		super();
		
	}

	public Manx(String name) {
		super(name);
		
	}
	
}
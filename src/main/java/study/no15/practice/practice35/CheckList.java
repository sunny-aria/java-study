package study.no15.practice.practice35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CheckList {
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probableDogs){
		probableDogs.add(new Cat());
	}
	public static void main(String[] args) {
		List<Dog> dogs1= new ArrayList<Dog>();
		oldStyleMethod(dogs1);
		List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(),Dog.class);//checked 系列进行强类型检查
		try{
			oldStyleMethod(dogs2);
		}catch(Exception e){
			System.err.println(e);
		}
		//checkedList  对于衍生类正常
		List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(),Pet.class );
		pets.add(new Cat());
		pets.add(new Dog());
	}

}

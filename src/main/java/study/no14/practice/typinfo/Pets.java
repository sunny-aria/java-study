package study.no14.practice.typinfo;

import java.util.ArrayList;

public class Pets {
//	public static final PetCreator creator = new LiteralPetCreator();
	public static final UseFactoryPetCreator creator = new UseFactoryPetCreator();
	public static Pet randomPet(){
		return creator.randomPet();
	}
	public static Pet[] creatArray(int size){
		return creator.createArray(size);
	}
	public static ArrayList<Pet> arrayList(int size){
		return creator.arrayList(size);
	}
}

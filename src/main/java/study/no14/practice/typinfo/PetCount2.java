package study.no14.practice.typinfo;

public class PetCount2 {

	public static void main(String[] args) {
		TypeCounter tc = new TypeCounter(Pet.class);
		for(Pet pet:Pets.creatArray(20)){
			System.out.println(pet.getClass().getSimpleName()+" ");
			tc.count(pet);
		}
		System.out.println("----------");
		System.out.println(tc);
	}

}

package study.no14.practice.typinfo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
	public static final List<Class<? extends Pet>> types = Collections.unmodifiableList(Arrays.asList(Pet.class,Dog.class,
			Mutt.class,Cat.class,Pug.class,Manx.class));
	
	@Override
	public List<Class<? extends Pet>> types() {

		return types;
	}

	public static void main(String[] args) {
		System.out.println(types);
	}

}

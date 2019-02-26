package study.no14.practice.typinfo;

import java.util.ArrayList;
import java.util.List;

public class UseFactoryPetCreator extends PetCreator {
	public static final List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	static{
		types.add(Mutt.class);
		types.add(Cat.class);
		types.add(Pug.class);
		types.add(Manx.class);
	}
	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}

}

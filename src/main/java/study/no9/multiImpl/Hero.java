package study.no9.multiImpl;

public class Hero extends ActionCharacter implements MultiImpl, CanClimb, CanFly {

	@Override
	public void swim() {
		System.out.println("I 'm a hero,I can swim");
	}

	@Override
	public void fly() {
		System.out.println("I 'm a hero,I can fly");

	}

	@Override
	public void climb() {
		System.out.println("I 'm a hero,I can climb");

	}

}

package study.no9.multiImpl;

public class Adventure {
	public static void canClimb(CanClimb c){c.climb();}
	public static void canFight(CanFight c){c.fight();}
	public static void canFly(CanFly c){c.fly();}
	public static void canSwim(CanSwim c){c.swim();}
	public static void canMulti(MultiImpl multi){
		multi.fight();
		multi.swim();
	}
	public static void main(String[] args) {
		Hero h = new Hero();
		canClimb(h);
		canFight(h);
		canFly(h);
		canSwim(h);
		canMulti(h);
	}

}

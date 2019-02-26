package study.no15.practice.practice25;
/**
 * 每个层次增加泛型边界，示例
 * EpicBattle.java
 * @author sunny
 * 2016年12月21日上午8:11:22
 */
public class EpicBattle {

	static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero){
		hero.getPower().hearSubtleNoises();
	}
	static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero){
		hero.getPower().hearSubtleNoises();
		hero.getPower().trackSmell();
	}
	
	public static void main(String[] args) {
		DogBoy dogBoy = new DogBoy();
		dogBoy.hear();
		dogBoy.smell();
		
		useSuperHearing(dogBoy);
		superFind(dogBoy);
	}

}
interface SuperPower{}
interface XRayVision extends SuperPower{
	void seeThroughWalls();
}
interface SuperHearing extends SuperPower{
	void hearSubtleNoises();
}
interface SuperSmell extends SuperPower{
	void trackSmell();
}
class SuperHero<POWER extends SuperPower>{
	POWER power;
	SuperHero(POWER power){
		this.power=power;
	}
	POWER getPower(){return power;}
}

class SuplerSleuth<POWER extends XRayVision> extends SuperHero<POWER>{

	SuplerSleuth(POWER power) {
		super(power);
	}
	void see(){this.getPower().seeThroughWalls();}
}
//注意此处泛型边界的写法，多个类和接口时，类在前，接口在后，用 & 隔开
class CannineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER>{

	CannineHero(POWER power) {
		super(power);
	}
	void hear(){this.getPower().hearSubtleNoises();}
	void smell(){this.getPower().trackSmell();}
	
}

class SuperHearSmell implements SuperHearing ,SuperSmell{

	@Override
	public void trackSmell() {
		System.out.println("SuperHearSmell traceSmell.");
	}

	@Override
	public void hearSubtleNoises() {
		System.out.println("SuperHearSmell hear.");
	}
	
}

class DogBoy extends CannineHero<SuperHearSmell>{

	DogBoy() {
		super(new SuperHearSmell());
	}
}



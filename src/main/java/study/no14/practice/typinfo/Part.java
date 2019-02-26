package study.no14.practice.typinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part {
	public String toString(){
		return getClass().getSimpleName();
	}
	static List<Class<? extends Part>> partFactories= new ArrayList<Class<? extends Part>>();
	static{
		partFactories.add(FuelFilter.class);
		partFactories.add(AirFilter.class);
		partFactories.add(FanBelt.class);
		partFactories.add(PowerSteerIngBelt.class);
	}
	private static Random rand = new Random(47);
	public static Part createRandom(){
		int n=rand.nextInt(partFactories.size());
		try {
			return partFactories.get(n).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			return null;
		}
	}
}
class Filter extends Part{}
class FuelFilter extends Filter{
	public FuelFilter(){}
}

class AirFilter extends Filter{
	public AirFilter(){}
}

class Belt extends Part{}

class FanBelt extends Belt{
	public FanBelt(){}
}
class PowerSteerIngBelt extends Belt{
	public PowerSteerIngBelt(){}
}
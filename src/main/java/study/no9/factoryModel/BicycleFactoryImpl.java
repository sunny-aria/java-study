package study.no9.factoryModel;

public class BicycleFactoryImpl implements CycleFactory {

	@Override
	public Cycle getCycle(String message) {
		return new Bicycle(message);
	}

}

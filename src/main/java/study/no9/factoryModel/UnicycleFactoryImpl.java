package study.no9.factoryModel;

public class UnicycleFactoryImpl implements CycleFactory {

	@Override
	public Cycle getCycle(String message) {
		return new Unicycle(message);
	}

}

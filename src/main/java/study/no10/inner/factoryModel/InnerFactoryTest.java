package study.no10.inner.factoryModel;

public class InnerFactoryTest {

	public static void main(String[] args) {
		System.out.println(BiCycleImpl.factory.getCycle("test").run());
	}

}

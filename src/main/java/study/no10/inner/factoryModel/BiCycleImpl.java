package study.no10.inner.factoryModel;

public class BiCycleImpl implements Cycle {

	@Override
	public String run() {
		return "inner claz test  factory model";//使用匿名内部类测试工厂方法
	}
	private BiCycleImpl(){	}//私有构造
	
	public static CycleFactory factory= new CycleFactory(){
		@Override
		public Cycle getCycle(String message) {
			return new BiCycleImpl();
		}
	};
}

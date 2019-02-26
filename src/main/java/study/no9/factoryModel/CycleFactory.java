package study.no9.factoryModel;
/**
 * 工厂对象上调用的是创建方法，该工厂对象将生成接口的某个实现的对象
 * @author Administrator
 *
 */
public interface CycleFactory {
		Cycle getCycle(String message);
		
		//测试接口内部类，public 的
		class SunnyInnerFactoryImpl implements CycleFactory{

			@Override
			public Cycle getCycle(String message) {
				return new Unicycle(message);
			}
			
		}
}

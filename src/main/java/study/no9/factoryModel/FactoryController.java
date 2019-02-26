package study.no9.factoryModel;
/* *
 * 模拟业务场景进行工厂方法测试
 * 16-10-26 8:11
 * */
public class FactoryController {

	//此方法相当于Service处理方法
	public static  String getMessage(String message){
		CycleFactory factory = null;
		//根据传入的消息类型进行对应的业务处理
		if("1".equals(message)){
			factory = new BicycleFactoryImpl();
		}else{
			factory  = new UnicycleFactoryImpl();
		}
		Cycle cycle = factory.getCycle(message);//工厂对象调用创建方法生成某个接口的具体的实现对象，由实现对象完成业务逻辑的处理
		return cycle.run();
	}
	
	public static void main(String[] args) {
		//此处相当于Controller 类的业务处理，接收参数后进行业务处理
//		String message ="<xml>factory</xml>";
		String message ="1";
		System.out.println(getMessage(message));
		
	}

}

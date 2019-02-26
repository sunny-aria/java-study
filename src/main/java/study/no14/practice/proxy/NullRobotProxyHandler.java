package study.no14.practice.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
/**
 * 空对象动态代理
 * NullRobotProxyHandler.java
 * @author sunny
 * 2016年12月7日上午8:30:45
 */
public class NullRobotProxyHandler implements InvocationHandler {
	String nullname ;
	private Object proxied = new NRobot();
	
	public NullRobotProxyHandler(Class<? extends Robot> type) {
		nullname = type.getSimpleName()+" nullRobot";
	}
	private class NRobot implements Null,Robot{

		@Override
		public String name() {
			
			return nullname;
		}

		@Override
		public String model() {
			
			return nullname;
		}

		@Override
		public List<Operation> operations() {
			
			return Collections.emptyList();
		}
		
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		return method.invoke(proxied, args);
	}

}

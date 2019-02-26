package study.no15.practice.practice39;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * 使用动态代理混合
 * DynamicMinixProxy.java
 * @author sunny
 * 2017年1月4日上午8:03:04
 */
public class DynamicMinixProxy {

	public static void main(String[] args) {
		Object mixin = MixinProxy.newInstance(new TwoTuple(new BasicImpl(),Basic.class),
				new TwoTuple(new TimeStampedImpl(),TimeStamped.class),
				new TwoTuple(new SerialNumberedImpl(),SerialNumbered.class));
		Basic b = (Basic) mixin;
		TimeStamped t = (TimeStamped)mixin;
		SerialNumbered s = (SerialNumbered)mixin;
		b.set("sunny");
		System.out.println(b.getVal());
		System.out.println(t.getStamp());
		System.out.println(s.getSerialNumber());
	}

}
/**
 * 动态代理实现
 * DynamicMinixProxy.java
 * @author sunny
 * 2017年1月4日上午8:05:01
 */
class MixinProxy implements InvocationHandler{
	Map<String,Object> delegatesByMethod;
	public MixinProxy(TwoTuple<Object,Class<?>>... pairs){//the first interface in the Map  implements the method
		delegatesByMethod = new HashMap<String ,Object>();
		for(TwoTuple<Object,Class<?>> pair:pairs){
			for(Method method:pair.second.getMethods()){
				String methodName = method.getName();
				if(!delegatesByMethod.containsKey(methodName)){
					delegatesByMethod.put(methodName, pair.first);
				}
			}
		}
	}
	/**
	 * 动态代理方法
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		Object obj = delegatesByMethod.get(methodName);
		return method.invoke(obj, args);
	}
	/**
	 * 生成代理接口
	 * @param pairs
	 * @return
	 */
	public static Object newInstance(TwoTuple... pairs){
		Class[] interfaces = new Class[pairs.length];
		for(int i=0;i<pairs.length;i++){
			interfaces[i]=(Class) pairs[i].second;
		}
		ClassLoader cl = pairs[0].first.getClass().getClassLoader();
		return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(pairs));
	}
}


interface TimeStamped{ long getStamp();}
class TimeStampedImpl implements TimeStamped{
	private final long timeStamp;
	public TimeStampedImpl(){
		timeStamp = new Date().getTime();
	}
	@Override
	public long getStamp() {
		
		return timeStamp;
	}
}

interface SerialNumbered{ long getSerialNumber();}
class SerialNumberedImpl implements SerialNumbered{
	private static long counter =1;
	private final long serialNumber = counter++;//思路可用于统一订单生成
	@Override
	public long getSerialNumber() {
		
		return serialNumber;
	}
}
interface Basic{
	public void set(String val);
	String getVal();
}
class BasicImpl implements Basic{
	String val;
	public void set(String val){
		this.val=val;
	}
	public String getVal(){
		return val;
	}
}

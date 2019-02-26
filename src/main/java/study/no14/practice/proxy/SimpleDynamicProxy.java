package study.no14.practice.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 实现动态代理，
 * SimpleDynamicProxy.java
 * @author sunny
 * 2016年12月5日上午7:37:55
 */
class DynamicProxyHandler implements InvocationHandler{//继承InvocationHandler类
	private Object proxied; //被代理对象，可以声明为Object类型
	private static int count=0;
	public DynamicProxyHandler(Object proxied){
		this.proxied=proxied;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("---- proxy:"+proxy.getClass()+" , method: "+method+" ,args: "+args);
		if(method.getName().equals("dosomething")){//可以过滤特定的方法
			System.out.println(" count++: "+(count++));
		}
		if(args!=null){
			for(Object arg:args){
				System.out.println(" "+arg);
			}
		}
		
		return method.invoke(proxied, args); //实际对象的方法执行
	}
}


/**
 * 使用java 动态代理
 * SimpleDynamicProxy.java
 * @author sunny
 * 2016年12月5日上午7:35:54
 */
public class SimpleDynamicProxy {
	public static void consumer(Interface iface){
		iface.dosomething();
		iface.dosomethingElse(" dynamic bonobo.");
	}
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		System.out.println("-------dynamic proxy------");
		Interface proxy = (Interface) Proxy.newProxyInstance(//调用静态方法 Proxy.newProxyInstance()可以创建动态代理
				Interface.class.getClassLoader(), // arg0 类加载器
				new Class[]{Interface.class}, //arg1 希望该代理实现的接口列表（不是类或抽象类,是接口列表）
				new DynamicProxyHandler(real));//arg2  InvocationHandler 接口的一个实现
		consumer(proxy);
	}

}



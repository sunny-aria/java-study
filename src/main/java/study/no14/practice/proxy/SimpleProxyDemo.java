package study.no14.practice.proxy;

interface Interface{
	void dosomething();
	void dosomethingElse(String arg);
}
class RealObject implements Interface{

	@Override
	public void dosomething() {
		System.out.println("doSomething");
	}

	@Override
	public void dosomethingElse(String arg) {
		System.out.println("dosomethingElse arg: "+arg);
	}
	
}
/**
 * 手动代理
 * SimpleProxyDemo.java
 * @author sunny
 * 2016年12月5日上午7:33:35
 */
class SimpleProxy implements Interface{
	private Interface proxied;//实际对象
	private static int count=0;
	public SimpleProxy(Interface proxied){
		this.proxied=proxied;
	}
	@Override
	public void dosomething() {
		System.out.println("simpleProxy dosomething count++:"+(count++));//额外的业务操作
		proxied.dosomething();//实际的业务操作
	}
	@Override
	public void dosomethingElse(String arg) {
		System.out.println("simple dosomethingElse count++:"+(count++));
		proxied.dosomethingElse(arg);
	}
	
}

/**
 * 代理模式
 * SimpleProxyDemo.java
 * @author sunny
 * 2016年12月5日上午7:22:59
 */
public class SimpleProxyDemo {

	public static void consumer(Interface iface){
		iface.dosomething();
		iface.dosomethingElse("bonobo");
	}
	
	
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}

}

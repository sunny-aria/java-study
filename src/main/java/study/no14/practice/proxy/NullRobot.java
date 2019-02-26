package study.no14.practice.proxy;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理，一个空的Robot对象
 * NullRobot.java
 * @author sunny
 * 2016年12月7日上午8:35:45
 */
public class NullRobot {
	//使用动态代理创建一个Null 对象
	public static Robot newNullRobot(Class<? extends Robot> type){
		return (Robot) Proxy.newProxyInstance(NullRobot.class.getClassLoader(), 
				new Class[]{Null.class,Robot.class}, new NullRobotProxyHandler(type));
	}
	public static void main(String[] args) {
		Robot[] robots = {new SnowRemoveRobot("SnowBee"),newNullRobot(SnowRemoveRobot.class)};
		
		for(Robot bot:robots){
			Robot.Test.test(bot);
		}
	}

}

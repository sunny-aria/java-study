package study.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理
 */
public class MainClass {
    public static void main(String[] args) {
        Star star = new JJStar();
        Handler handler = new Handler(star);
        Star proxy = (Star) Proxy.newProxyInstance(MainClass.class.getClassLoader(),new Class[]{Star.class},handler);
        proxy.sing();
    }
}


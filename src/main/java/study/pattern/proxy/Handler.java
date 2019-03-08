package study.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的执行者
 */
public class Handler implements InvocationHandler {
    private Star star;

    public Handler(Star star) {
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("sing".equals(method.getName())){
            System.out.println("和林俊杰制定唱歌计划");
            //注意这里的star对象，这里调用的是star的方法
            method.invoke(star,args);
            System.out.println("演唱会结束");
        }
        return null;
    }
}

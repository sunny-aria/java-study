package study.pattern.observer;

/**
 * 功能描述：测试观察者模式
 *
 * @Auther:
 * @Date: 2018/10/30
 */
public class TestObserver {
    public static void main(String[] args) {
        User hd = new User();
        hd.setName("haodong");
        User dj = new User();
        dj.setName("daojian");

        Subject subject = new SubjectImpl();
        /**
         *这种将观察者加入被观察者是错误的，正确的是观察者中观察  被观察者，俗称订阅
         * 意思是在观察者中注入被观察者，被观察者调用register方法
         */
        /*subject.registerObserver(hd);
        subject.registerObserver(dj);
        subject.notifyObserver("本台最新消息：现在播放嘴巴嘟嘟");
        subject.removeObserver(hd);
        subject.notifyObserver("现在播放：那个男人");*/
        /**------------使用订阅的方式------------------**/
        hd.setSubject(subject);
        dj.setSubject(subject);
        subject.notifyObserver("现在播放：好好说！");
    }
}

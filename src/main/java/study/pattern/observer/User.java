package study.pattern.observer;


/**
 * 功能描述：
 *
 * @Auther:
 * @Date: 2018/10/26
 */
public class User implements ObserverSelf {
    private String name;
    //增加被观察者，方便订阅
    private Subject subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject, Object obj) {
        System.out.println(this.getName()+" 接收到了："+subject+" 消息："+obj.toString());

    }
}

package study.pattern.observer;

import java.util.Observer;

/**
 * 功能描述：抽象被观察者接口，包含三个方法，注册，移除，通知
 *
 * @Auther: haodong
 * @Date: 2018/10/26
 */
public interface Subject {

    void registerObserver(ObserverSelf o);
    void removeObserver(ObserverSelf o);
    void notifyObserver(String message);
}

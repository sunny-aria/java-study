package study.pattern.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：被观察者
 *
 * @Auther:
 * @Date: 2018/10/26
 */
public class SubjectImpl implements Subject {
    List<ObserverSelf> list = new ArrayList<>();
    @Override
    public void registerObserver(ObserverSelf o) {
        list.add(o);
    }

    @Override
    public void removeObserver(ObserverSelf o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver(String message) {
        list.stream().forEach(i->{
            i.update(this,message);
        });
    }
}

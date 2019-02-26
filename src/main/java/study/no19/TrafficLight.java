package study.no19;

import static study.no19.Signal.*;

/**
 * 红绿灯
 *
 * @author sunny
 * @create 2017/3/23 14:29
 **/
public class TrafficLight {
    Signal signal;
    public TrafficLight(Signal signal){
        this.signal = signal;
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "signal=" + signal +
                '}';
    }
    public static void main(String[] args){
        System.out.println(new TrafficLight(GREEN));
    }
}

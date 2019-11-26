package com.hd.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 描述：  SimpleDateFormat 线程安全问题
 * @author hd
 * @date 2019-11-26 11:25
 **/
public class SdfDemo {
    private final  static ThreadLocal<DateFormat> tl = new ThreadLocal<DateFormat>(){
        @Override
        protected SimpleDateFormat initialValue(){
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
    public static void main(String[] args) {

        // 10个线程，将10个日期字符串使用SimpleDateFormat转为Date
        for (int i = 0; i < 10; i++) {
            String str = "2019-11-0"+i;
            new Thread(()->{
                try {
                    System.out.println(tl.get().parse(str)+" 对象:"+tl.get());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

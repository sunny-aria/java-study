package study.daily.reflect;

import lombok.Data;

import java.lang.reflect.Field;

/**
 * 描述：
 *
 * @author sundongfeng
 * @date 2021/3/4 11:44
 */

public class ReflectTest {
    private String a;

    public static void main(String[] args) {
        ReflectTest test = new ReflectTest();
        test.setA("test");
        try {
            Field field = ReflectTest.class.getDeclaredField("a");
            field.setAccessible(true);
            String val = (String) field.get(test);
            System.out.println(val);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}

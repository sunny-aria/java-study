package study.pattern.factory.normal;

import study.pattern.factory.simple.FoodPizza;

/**
 * 功能描述：上海店肉披萨
 *
 * @Auther:
 * @Date: 2018/10/31
 */
public class SHMeatPizza implements FoodPizza {
    @Override
    public void prepare() {
        System.out.println("上海店：准备了肉");
    }

    @Override
    public void bake() {
        System.out.println("上海店：肉披萨准备烤");
    }

    @Override
    public void cut() {
        System.out.println("上海店：肉披萨切开");
    }
}

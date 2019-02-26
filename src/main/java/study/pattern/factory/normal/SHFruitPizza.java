package study.pattern.factory.normal;

import study.pattern.factory.simple.FoodPizza;

/**
 * 功能描述：上海店水果披萨
 *
 * @Auther:
 * @Date: 2018/10/31
 */
public class SHFruitPizza implements FoodPizza {
    @Override
    public void prepare() {
        System.out.println("上海店：水果已经准备好");
    }

    @Override
    public void bake() {
        System.out.println("上海店：水果披萨做好了，开始烤");
    }

    @Override
    public void cut() {
        System.out.println("上海店：水果披萨切");
    }
}

package study.pattern.factory.normal;

import study.pattern.factory.simple.FoodPizza;

/**
 * 功能描述：bj 店准备的水果披萨
 *
 * @Auther:
 * @Date: 2018/10/31
 */
public class BJFruitPizza implements FoodPizza {
    @Override
    public void prepare() {
        System.out.println("北京店：准备水果");
    }

    @Override
    public void bake() {
        System.out.println("北京店：准备烤水果披萨");

    }

    @Override
    public void cut() {
        System.out.println("北京店：准备切水果披萨");
    }
}

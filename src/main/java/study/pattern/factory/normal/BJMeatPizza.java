package study.pattern.factory.normal;

import study.pattern.factory.simple.FoodPizza;

/**
 * 功能描述：bj店准备的肉披萨
 *
 * @Auther:
 * @Date: 2018/10/31
 */
public class BJMeatPizza implements FoodPizza {
    @Override
    public void prepare() {
        System.out.println("北京店：准备肉材料");
    }

    @Override
    public void bake() {
        System.out.println("北京店：开始烤");
    }

    @Override
    public void cut() {
        System.out.println("北京店：开始切");
    }
}

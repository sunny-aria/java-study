package study.pattern.factory.normal;

import study.pattern.factory.simple.FoodPizza;

/**
 * 功能描述：上海披萨店
 *
 * @Auther:
 * @Date: 2018/10/31
 */
public class SHPizzaStore extends PizzaStore {
    @Override
    protected FoodPizza createPizza(String type) {
        FoodPizza pizza;
        if("meat".equals(type)){
            pizza = new SHMeatPizza();
        }else {
            pizza = new SHFruitPizza();
        }
        return pizza;
    }
}

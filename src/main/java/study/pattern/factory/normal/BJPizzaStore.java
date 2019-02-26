package study.pattern.factory.normal;

import study.pattern.factory.simple.FoodPizza;

/**
 * 功能描述：北京披萨店
 *
 * @Auther:
 * @Date: 2018/10/31
 */
public class BJPizzaStore extends PizzaStore {
    @Override
    protected FoodPizza createPizza(String type) {
        FoodPizza foodPizza ;
        if("meat".equals(type)){
            foodPizza = new BJMeatPizza();
        }else{
            foodPizza = new BJFruitPizza();
        }
        return foodPizza;
    }
}

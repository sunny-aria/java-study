package study.pattern.factory.normal;

import study.pattern.factory.simple.FoodPizza;

/**
 * 功能描述：工厂模式，抽象门店接口，用于生成不同的分店。
 * 感觉是将简单工厂模式复制多套的过程，单店模式变多店模式，
 * 多店行为抽象升级为接口，每个店的子类自己负责生产线，
 * 生产不同的产品，举例来说，北京上海2家店，北京店自己生产各种Pizza，
 * 上海店自己生产各种pizza，口味可能不同
 *
 * @Auther:haodong
 * @Date: 2018/10/31
 */
public abstract class PizzaStore {

    public void orderPizza(String type){
        FoodPizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }

    /**
     * 由不同的店重写这个方法
     * @param type
     * @return
     */
    protected abstract FoodPizza createPizza(String type);
}

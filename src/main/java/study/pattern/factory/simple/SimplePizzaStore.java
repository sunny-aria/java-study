package study.pattern.factory.simple;

/**
 * 功能描述：门店，负责下单,这是个业务范围，门店负责生产pizza订单
 *
 * @Auther: haodong
 * @Date: 2018/10/30
 */
public class SimplePizzaStore {
    private SimpleFactory factory;

    public SimpleFactory getFactory() {
        return factory;
    }

    public void setFactory(SimpleFactory factory) {
        this.factory = factory;
    }

    /**
     * 下订单
     * @param tag 类型
     */
    public void pizzaOrderCreate(String tag){
        FoodPizza pizza = factory.createPizza(tag);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }
}

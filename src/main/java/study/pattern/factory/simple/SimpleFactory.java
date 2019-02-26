package study.pattern.factory.simple;

/**
 * 功能描述： 简单工厂负责根据类型，生产pizza
 *
 * @Auther: haodong
 * @Date: 2018/10/30
 */
public class SimpleFactory {


    public FoodPizza createPizza(String tag){
        FoodPizza pizza = null;
        if("meat".equals(tag)){
             pizza = new MeatPizza();
        }else{
            pizza = new FruitPizza();
        }
        return pizza;
    }
}

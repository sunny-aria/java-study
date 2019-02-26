package study.pattern.factory.normal;

/**
 * 功能描述：
 *
 * @Auther:
 * @Date: 2018/10/31
 */
public class TestNormalFactory {
    public static void main(String[] args) {
//        String location = "BJ";
        String location = "SH";
        PizzaStore pizzaStore = null;
        if("BJ".equals(location)){
            System.out.println("我要吃北京店的披萨");
            pizzaStore = new BJPizzaStore();
        }else if("SH".equals(location)){
            pizzaStore = new SHPizzaStore();
        }
        pizzaStore.orderPizza("meat");
        pizzaStore.orderPizza("fruit");
    }
}

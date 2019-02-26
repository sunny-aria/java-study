package study.pattern.factory.simple;

/**
 * 功能描述：
 *
 * @Auther:
 * @Date: 2018/10/30
 */
public class FruitPizza implements FoodPizza {
    @Override
    public void prepare() {
        System.out.println("准备好了水果披萨的食材");
    }

    @Override
    public void bake() {
        System.out.println("水果披萨开始烤了");
    }

    @Override
    public void cut() {
        System.out.println("水果披萨开始切了");
    }
}

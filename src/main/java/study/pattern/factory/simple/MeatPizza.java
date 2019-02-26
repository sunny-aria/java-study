package study.pattern.factory.simple;

/**
 * 功能描述：
 *
 * @Auther:
 * @Date: 2018/10/30
 */
public class MeatPizza implements FoodPizza {
    @Override
    public void prepare() {
        System.out.println("准备好了肉");
    }

    @Override
    public void bake() {
        System.out.println("准备烤肉");
    }

    @Override
    public void cut() {
        System.out.println("出锅后切片");
    }
}

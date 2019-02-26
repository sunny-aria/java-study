package study.pattern.factory.simple;

/**
 * 功能描述：
 *
 * @Auther:
 * @Date: 2018/10/30
 */
public interface FoodPizza {
    /**
     * 准备
     */
    void prepare();

    /**
     * 烘烤
     */
    void bake();

    /**
     * 切
     */
    void cut();
}

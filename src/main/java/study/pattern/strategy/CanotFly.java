package study.pattern.strategy;

/**
 * 功能描述：
 *
 * @Auther:
 * @Date: 2018/10/26
 */
public class CanotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞不动杂办！！飞不动！！");
    }
}

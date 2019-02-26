package study.pattern.strategy;

/**
 * 功能描述：飞行
 *
 * @Auther: haodong
 * @Date: 2018/10/26
 */
public class CanFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我要飞，就是要飞");
    }
}

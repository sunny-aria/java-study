package study.pattern.strategy;

/**
 * 功能描述：小黄鸭
 *
 * @Auther:
 * @Date: 2018/10/26
 */
public class YelloDuck extends Duck {
    public YelloDuck() {
        this.setFlyBehavior(new CanotFly());
    }

    @Override
    void display() {
        this.getFlyBehavior().fly();
    }
}

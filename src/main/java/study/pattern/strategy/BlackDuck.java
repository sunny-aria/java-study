package study.pattern.strategy;

/**
 * 功能描述：
 *
 * @Auther:
 * @Date: 2018/10/26
 */
public class BlackDuck extends Duck{
    public BlackDuck() {
        this.setFlyBehavior(new CanFly());
    }

    @Override
    void display() {
        this.getFlyBehavior().fly();
    }
}

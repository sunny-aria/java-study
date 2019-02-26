package study.pattern.strategy;

/**
 * 功能描述：
 *
 * @Auther:
 * @Date: 2018/10/26
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    abstract void display();
}

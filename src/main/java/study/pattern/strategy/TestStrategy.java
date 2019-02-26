package study.pattern.strategy;

/**
 * 功能描述：测试策略模式
 *
 * @Auther: haodong
 * @Date: 2018/10/26
 */
public class TestStrategy {

    public static void main(String[] args) {
        Duck yello = new YelloDuck();
        yello.display();
        //改变子类，实现策略
        Duck black = new BlackDuck();
        black.display();
    }
}

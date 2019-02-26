package study.pattern.template;

/**
 * 土豆丝
 *
 * @author sunny
 * @create 2017/11/2 14:47
 **/
public class Potato extends DoDishTemplate {
    /**
     * 备料
     */
    @Override
    public void preparation() {
        System.out.println("土豆丝切好啦");
    }

    /**
     * 做菜
     */
    @Override
    public void doing() {
        System.out.println("土豆丝入锅开始炒啦");
    }

    /**
     * 上菜
     */
    @Override
    public void carriedDishes() {
        System.out.println("土豆丝已经做好，上菜吧");
    }
}

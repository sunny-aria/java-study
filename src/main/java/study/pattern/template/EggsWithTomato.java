package study.pattern.template;

/**
 * 西红柿炒蛋
 *
 * @author sunny
 * @create 2017/11/2 14:41
 **/
public class EggsWithTomato extends DoDishTemplate {
    /**
     * 备料
     */
    @Override
    public void preparation() {
        System.out.println("开始做西红柿啦，准备好了鸡蛋和西红柿");
    }

    /**
     * 做菜
     */
    @Override
    public void doing() {
        System.out.println("先做好鸡蛋，再炒西红柿，然后将鸡蛋放入西红柿中。");
    }

    /**
     * 上菜
     */
    @Override
    public void carriedDishes() {
        System.out.println("鸡蛋西红柿好了，可以上菜开吃啦。。。");
    }
}

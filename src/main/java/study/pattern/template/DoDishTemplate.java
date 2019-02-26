package study.pattern.template;

/**
 * 模版模式 父类
 * ====================================================================
 * 定义一个操作中算法的骨架，而将一些步骤延迟到子类中，
 * 模板方法使得子类可以不改变算法的结构即可重定义该算法的某些特定步骤。
 * 通俗点的理解就是 ：完成一件事情，有固定的数个步骤，
 * 但是每个步骤根据对象的不同，而实现细节不同；
 * 就可以在父类中定义一个完成该事情的总方法，
 * 按照完成事件需要的步骤去调用其每个步骤的实现方法。
 * 每个步骤的具体实现，由子类完成。
 * ====================================================================
 * @author sunny
 * @create 2017/11/2 14:35
 * （1）备料 （2）具体做菜 （3）盛菜端给客人
 **/
public abstract class DoDishTemplate {

    /**
     * 模版方法，将固定的步骤放入里面
     */
    protected void templateMethod(){
        base();
        preparation();
        doing();
        carriedDishes();
    }

    public void base(){
        System.out.println("油盐酱醋已经备好。");
    }

    /**
     * 备料
     */
    public abstract void preparation();
    /**
     * 做菜
     */
    public abstract void doing();
    /**
     * 上菜
     */
    public abstract void carriedDishes ();

}

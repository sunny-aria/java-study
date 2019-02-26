package study.pattern.singleton;

/**
 * ***********适用场合**********
 * 需要频繁的进行创建和销毁的对象；
 * 创建对象时耗时过多或耗费资源过多，但又经常用到的对象；
 * 工具类对象；
 * 频繁访问数据库或文件的对象。
 * 通过枚举的方式
 */
public class SingletonForEnum {

    private enum EnumSingleton{
        SINGLETON;
        private Singleton singleton;
        EnumSingleton(){
            singleton = new Singleton();
        }
        public Singleton getInstance(){
            return singleton;
        }
    }
    public static Singleton getInstance(){
        return EnumSingleton.SINGLETON.getInstance();
    }
}
class Singleton{
    public Singleton(){}
}

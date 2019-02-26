package study.pattern.singleton;

/**
 * 推荐使用，线程安全
 */
public class SingletonForThread {
    private static SingletonForThread instance = null;
    private SingletonForThread(){}
    public static SingletonForThread getInstance(){
        //双重检查
        if(instance == null){
            synchronized (SingletonForThread.class){
                if(instance==null){
                    instance = new SingletonForThread();
                }
            }
        }
        return instance;
    }
}

package study.lambda;

import java.util.Collection;

/**
 * lambda 表达式学习
 *
 * @author sunny
 * @create 2018/5/11 18:22
 **/
public class Demo {
    /**
     * 1. 遍历集合
     * @param collection
     */
    public static void foreachCollection(Collection<?> collection ){
        collection.forEach(x -> System.out.println(x));
    }


}

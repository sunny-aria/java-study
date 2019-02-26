package study.no15.practice.zixianding;
/**
 * 使用自限定类型，在导出类中只有一个方法，并且这个方法接受到处类型而不是基类型为参数
 * SelfBoundingAndCovariantArguments.java
 * @author sunny
 * 2016年12月30日上午8:14:02
 */
public class SelfBoundingAndCovariantArguments {
	void testA(Setter s1,Setter s2,SelfBoundSetter sbs){
		s1.set(s2);
//		s1.set(sbs);
		//编译器不能识别将基类当作参数传递给set()的尝试，因为没有任何方法具有这样的签名。实际上这个参数已经被覆盖
	}
}
/**
 * 自限定参数
 * SelfBoundingAndCovariantArguments.java
 * @author sunny
 * 2016年12月30日上午8:16:28
 * @param <T>
 */
interface SelfBoundSetter<T extends SelfBoundSetter<T>>{
	void set(T arg);
}
interface Setter extends SelfBoundSetter<Setter>{}


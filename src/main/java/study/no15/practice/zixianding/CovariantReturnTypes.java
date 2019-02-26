package study.no15.practice.zixianding;
/**
 * 自限定，参数协变
 * CovariantReturnTypes.java
 * @author sunny
 * 2016年12月30日上午8:03:30
 */
public class CovariantReturnTypes {
	void test(DerivedGetter d){
		Derived d2 = d.get();
	}
}
class Base{}
class Derived extends Base{}
interface OrdinaryGetter{
	Base get();
}
interface DerivedGetter extends OrdinaryGetter{
	Derived get();
}
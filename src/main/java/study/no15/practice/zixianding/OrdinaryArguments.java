package study.no15.practice.zixianding;
/**
 * 不使用自限定，将重载参数类型
 * OrdinaryArguments.java
 * @author sunny
 * 2016年12月30日上午8:09:21
 */
public class OrdinaryArguments {

	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedSetter ds = new DerivedSetter();
		ds.set(base);
		ds.set(derived);
	}

}

class OrdinarySetter{
	void set(Base base){
		System.out.println("OrdinarySetter.set(base)");
	}
}
class DerivedSetter extends OrdinarySetter{
	void set(Derived derived){
		System.out.println("DerivedSetter.set(Derived)");
	}
}
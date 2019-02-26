package study.no15.practice.zixianding;
/**
 * 不使用自限定类型，普通的继承机制就会介入，也能够重载，就像非泛型的情况下一样
 * PlainGenericInhertitance.java
 * @author sunny
 * 2016年12月30日上午8:20:59
 */
public class PlainGenericInhertitance {

	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedGs dgs = new DerivedGs();
		dgs.set(base);
		dgs.set(derived);
	}

}
class GenericSetter<T>{
	void set(T arg){
		System.out.println("GenericSetter.set(Base)");
	}
}
class DerivedGs extends GenericSetter<Base>{
	void set(Derived deried){
		System.out.println("DerivedGs.set(Derived)");
	}
}
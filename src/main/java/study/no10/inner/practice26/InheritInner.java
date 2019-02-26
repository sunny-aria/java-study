package study.no10.inner.practice26;

public class InheritInner extends WithInner.Inner{
	InheritInner(WithInner wi){
		wi.super(); //默认构造器不行，1.导出类的构造器需要传递一个指向外围类对象的引用，2.必须在构造器内使用 encloseClassRefrence.super()
	}
	
	@Override
	public void f(){
		System.out.println("InheritInner override f()");
	}
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
		ii.f();
	}
}

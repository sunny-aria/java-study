package study.no10.inner.jubuclaz;

public class NoNameInner2 {
	public static  NoNameInner getInner(String txt){
		return new NoNameInner (txt){
			{System.out.println("inner class instance initializer");} //匿名内部类，实例初始化
			@Override
			void message() {
				System.out.println(txt);
			}
		};
	}
	
	public static void main(String[] args) {
		getInner("匿名内部类，实例初始化").message();;
	}
}

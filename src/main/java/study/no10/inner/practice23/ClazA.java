package study.no10.inner.practice23;

public class ClazA {
	
	public U23 u23(){
		//匿名内部类
		return new U23(){

			@Override
			public void ma() {
				System.out.println("claz inner ma");
			}
			@Override
			public void mb() {
				System.out.println("claz inner mb");
			}
			@Override
			public void mc() {
				System.out.println("claz inner mc");
			}
		};
	}
}

package study.no15.practice.zixianding;

public class Practice34Sub extends Practice34<Practice34Sub> {

	public static void main(String[] args) {
		Practice34Sub sub = new Practice34Sub();
		Practice34Sub ss = sub.f(sub);
	}

	@Override
	Practice34Sub get(Practice34Sub arg) {
		System.out.println("覆盖父类方法");
		return new Practice34Sub();
	}

}

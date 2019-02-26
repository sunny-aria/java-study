package study.no15.practice.practice20;

import study.no15.practice.cargoboat.Product;

public class Practice20Impl implements IPractice20 {

	@Override
	public String f() {
		return "sunny";
	}

	@Override
	public int g() {
		return 5;
	}
	//泛型擦除边界为Product
	public <T extends Product> void  a(T product){
		System.out.println(product instanceof Product);
		System.out.println(product instanceof IPractice20);
		System.out.println(product);
		System.out.println(f());
		System.out.println(g());
	}
	public static void main(String[] args) {
		new Practice20Impl().a(Product.generator.next());
	}
}

package study.no15.practice.cargoboat;

import java.util.Random;

import study.no15.practice.Generator;

/**
 * 商品
 * Product.java
 * @author sunny
 * 2016年12月16日上午7:45:28
 */
public class Product {
	private final int id;
	private String description;
	private double price;
	public Product(int id, String description, double price) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product ["+id + ":" + description + ", $" + price + "]";
	}
	
	public void priceChange(double change){
		price+=change;
	}
	
	public static Generator<Product> generator = new Generator<Product>(){
		private Random rand = new Random(47);
		@Override
		public Product next() {
			return new Product(rand.nextInt(1000),"Test",Math.round(rand.nextDouble()*1000.0)+0.99);
		}};
}

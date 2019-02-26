package study.no15.practice.cargoboat;

import java.util.ArrayList;

import study.no15.practice.Generators;

/**
 * 货架
 * Shelf.java
 * @author sunny
 * 2016年12月16日上午7:52:26
 */
public class Shelf extends ArrayList<Product> {
	public Shelf(int nProducts){
		Generators.fill(this, Product.generator, nProducts);
	}
}

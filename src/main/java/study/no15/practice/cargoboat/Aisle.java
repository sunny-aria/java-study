package study.no15.practice.cargoboat;

import java.util.ArrayList;
/**
 * 过道
 * Aisle.java
 * @author sunny
 * 2016年12月16日上午7:56:34
 */
public class Aisle extends ArrayList<Shelf>{
	public Aisle(int nShelves,int nProducts){//包含多少货架，多少商品
		for(int i=0;i<nShelves;i++){
			this.add(new Shelf(nProducts));
		}
	}
}

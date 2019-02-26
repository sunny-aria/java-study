package study.no15.practice.cargoboat;

import java.util.ArrayList;
/**
 * 船
 * Boat.java
 * @author sunny
 * 2016年12月16日上午7:59:11
 */
public class Boat extends ArrayList<Aisle>{
	public Boat(int nAisles,int nShelves,int nProducts){
		for(int i=0;i<nAisles;i++){
			add(new Aisle(nShelves,nProducts));
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(Aisle a:this){
			for(Shelf s:a){
				for(Product p:s){
					result.append(p).append("\n");
				}
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println(new Boat(2,8,5));
	}
}

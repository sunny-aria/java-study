package study.no14.practice.typinfo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 使用class.isInstance 测试class类型是否匹配
 * PetCount.java
 * @author sunny
 * 2016年11月30日上午7:43:34
 */
public class PetCount {
	static class PetCounter0 extends HashMap<Class<? extends Pet>,Integer>{
		public void count(){
			for(Class<? extends Pet> claz:LiteralPetCreator.types){
				System.out.println(claz.getSimpleName());
				Integer quantity = get(claz);
				if(quantity==null ){
					put(claz, 1);
				}else{
					put(claz,quantity+1);
				}
			}
		}
		public PetCounter0() {
			count();
		}
	}
	//使用静态内部类，实现继承
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>,Integer>{
		public PetCounter(){
			super(new PetCounter0());
		}
		public void count(Pet pet){
			for(Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()){
				if(pair.getKey().isInstance(pet)){
					put(pair.getKey(),pair.getValue()+1);
				}
			}
		}
		
		public String toString(){
			StringBuilder result = new StringBuilder("{");
			for(Map.Entry<Class<? extends Pet>,Integer> pair:entrySet()){
				result.append(pair.getKey().getSimpleName());
				result.append("=");
				result.append(pair.getValue());
				result.append(",");
			}
			result.delete(result.length()-2, result.length());
			result.append("}");
			return result.toString();
		}
	}
	
	public static void main(String[] args) {
		PetCounter petCount = new PetCounter();
		System.out.println(petCount);
		for(Pet pet:Pets.creatArray(20)){
			System.out.print(pet.getClass().getSimpleName()+" ");
			petCount.count(pet);
		}
		System.out.println();
		System.out.println(petCount);
	}

}

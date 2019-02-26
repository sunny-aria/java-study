package study.no14.practice.typinfo;

import java.util.HashMap;
import java.util.Map;

public class TypeCounter extends HashMap<Class<? >,Integer> {
	private Class<?> baseType;
	public TypeCounter(Class<?> baseType){
		this.baseType=baseType;
	}
	public void count(Object obj){
		Class<?> type = obj.getClass();
		if(baseType.isAssignableFrom(type)){//测试是否同类型或者是type的超类或接口
			countClass(type);
		}else{
			throw new RuntimeException(obj+ " type:"+type+" should be type or subType of"+baseType);
		}
	}
	
	private void countClass(Class<? > type){
		Integer quantity = get(type);
		if(type.isAssignableFrom(Pug.class) ){
//			System.out.println("quantity:"+quantity);
		}
		put(type,quantity==null?1:quantity+1);
		Class<?> superClass =  type.getSuperclass();
		if(superClass!=null && baseType.isAssignableFrom(superClass)){
			countClass(superClass);
		}
	}
	
	public String toString(){
		StringBuilder result = new StringBuilder("{");
		for(Map.Entry<Class<? >,Integer> pair:entrySet()){
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

package study.no17;

import java.util.AbstractList;
/**
 * 容器练习,使用abstractList 创建只读的list,你必须实现get(),size() 方法，这里使用了享元模式解决方案
 * CoutingIntegerList.java
 * @author sunny
 * 2017年1月24日下午11:38:43
 */
public class CoutingIntegerList extends AbstractList<Integer> {
	private int size;
	
	public CoutingIntegerList(int size) {
		this.size = size<0?0:size;
	}

	public static void main(String[] args) {
		System.out.println(new CoutingIntegerList(30));
	}

	@Override
	public Integer get(int index) {
		
		return Integer.valueOf(index);
	}

	@Override
	public int size() {
		
		return size;
	}

}

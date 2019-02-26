package study.no16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * ArrayOfGenerics.java
 * @author sunny
 * 2017年1月12日上午8:18:02
 */
public class ArrayOfGenerics {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String>[] ls;
		List[] la = new List[10];
		ls = la;
		ls[0] = new ArrayList<String>();
		System.out.println(Arrays.deepToString(ls));
//		ls[1] = new ArrayList<Integer>(); //编译错误
		//List<String> 是Object 子类型   is a subtype of Object 
		Object[] objects = ls;
		objects[0] = new ArrayList<Integer>();
		System.out.println(Arrays.deepToString(objects));
		
		List<BerylliumSphere>[] spheres = new List[10];
		for(int i=0;i<spheres.length;i++){
			spheres[i] = new ArrayList<BerylliumSphere>();
			spheres[i].add(new BerylliumSphere());
			spheres[i].add(new BerylliumSphere());
		}
		System.out.println(Arrays.deepToString(spheres));
		List<List<BerylliumSphere>> llbs = new ArrayList<>();
		List<BerylliumSphere> lbs = new ArrayList<>();
		lbs.add(new BerylliumSphere());
		lbs.add(new BerylliumSphere());
		llbs.add(lbs);
		List<BerylliumSphere> lbs1 = new ArrayList<>();
		lbs1.add(new BerylliumSphere());
		lbs1.add(new BerylliumSphere());
		llbs.add(lbs1);
		System.out.println(llbs);
	}

}

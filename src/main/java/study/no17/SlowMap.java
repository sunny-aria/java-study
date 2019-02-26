package study.no17;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * 自定义map
 * SlowMap.java
 * @author sunny
 * 2017年2月14日上午8:21:50
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	
	public V put(K key,V value){
		V oldValue = get(key);
		if(!keys.contains(key)){
			keys.add(key);
			values.add(value);
		}else{
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}
	
	public V get(Object key){
		if(keys.contains(key)){
			return values.get(keys.indexOf(key));
		}else{
			return null;
		}
	}
	
	
	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K,V>> set = new HashSet<Map.Entry<K,V>>();
		Iterator<K> ki =keys.iterator();
		Iterator<V> vi = values.iterator();
		while(ki.hasNext()){
			set.add(new MapEntry<K,V>(ki.next(),vi.next()));
		}
		return set;
	}

	public static void main(String[] args) {
		SlowMap<String, String> map = new SlowMap<String,String>();
		map.put("sky", "blue");
		map.put("grass", "green");
		map.put("ocean", "dancing");
		map.put("tree", "tall");
		map.put("earth", "brown");
		map.put("sun", "warm");
		System.out.println(map);
		System.out.println(map.get("sun"));
		System.out.println(map.entrySet());
	}
}

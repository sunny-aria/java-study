package study.no19;

import java.util.EnumMap;
import java.util.Map;

import static study.no19.AlarmPoints.*;
/**
 * EnumMap 使用练习，命令设计模式
 * EnumMaps.java
 * @author sunny
 * 2017年4月7日上午7:49:08
 */
public class EnumMaps {

	public static void main(String[] args) {
		EnumMap<AlarmPoints,Command> em = new EnumMap<AlarmPoints,Command>(AlarmPoints.class);
		em.put(KITCHEN, new Command(){
			@Override
			public void action() {
				System.out.println("kitchen fire");
			}
		});
		
		em.put(BATHROOM, new Command(){
			@Override
			public void action() {
				System.out.println("bathroom alert");
			}
		});
		
		for(Map.Entry<AlarmPoints, Command> entry:em.entrySet()){
			System.out.print(entry.getKey()+" : ");
			entry.getValue().action();
		}
		try{
		em.get(OFFICE1).action();
		}catch(Exception ec){
			System.out.println(ec);
		}
	}

}
interface Command{void action();}
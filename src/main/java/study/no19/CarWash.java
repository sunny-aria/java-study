package study.no19;

import java.util.EnumSet;

/**
 * 常量相关的方法，enum 可以允许出现一个或多个abstract 方法
 * CarWash.java
 * @author sunny
 * 2017年4月7日上午8:05:36
 */
public class CarWash {
	public enum Cycle{
		UNDERBODY{
			@Override
			void action() {
				System.out.println("spraying the underbody");
			}},
		WHEELWASH{

			@Override
			void action() {
				System.out.println("washing the wheels");
			}
				
			},
		PREWASH{

			@Override
			void action() {
				System.out.println("loosening the dirt");
			}
				
			},
		BASIC{

			@Override
			void action() {
				System.out.println("the basic wash");
			}
				
			},
		HOTWAX{

			@Override
			void action() {
				System.out.println("applying hot wax");
			}
				
			},
		RINSE{

			@Override
			void action() {
				System.out.println("rinsing");
			}
				
			},
		BLOWDRY{

			@Override
			void action() {
				System.out.println("blowing dry");
			}
				
			};
		abstract void action();
	}
		EnumSet<Cycle> cycles= EnumSet.of(Cycle.BASIC,Cycle.RINSE);
		public void add(Cycle cycle){
			cycles.add(cycle);//EnumSet 添加enum实例的顺序并不重要，因为其输出的次序决定于enum实例定义时的次序
		}
		public void washCar(){
			for(Cycle c:cycles){
				c.action();
			}
		}
		public String toString(){
			return cycles.toString();
		}
	public static void main(String[] args) {
		CarWash wash = new CarWash();
		System.out.println(wash);
		wash.washCar();
		wash.add(Cycle.BLOWDRY);
		wash.add(Cycle.BLOWDRY);
		wash.add(Cycle.RINSE);
		wash.add(Cycle.HOTWAX);
		System.out.println(wash);
		wash.washCar();
	}

}

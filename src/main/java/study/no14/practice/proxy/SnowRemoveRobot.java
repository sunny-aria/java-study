package study.no14.practice.proxy;

import java.util.Arrays;
import java.util.List;

public class SnowRemoveRobot implements Robot {
	private String name;
	public SnowRemoveRobot(String name){
		this.name=name;
	}
	@Override
	public String name() {

		return name;
	}

	@Override
	public String model() {

		return "SnowBot series 11";
	}
	@Override
	public List<Operation> operations() {
		
		return Arrays.asList(new Operation(){

			@Override
			public String description() {
				
				return  name+" can shovel snow";
			}

			@Override
			public String command() {
				
				return name+" shoveling snow";
			}},new Operation(){

				@Override
				public String description() {
					
					return name+" can chip ice";
				}

				@Override
				public String command() {
					
					return name+" chiping ice";
				}});
	}

	public static void main(String[] args){
		Robot.Test.test(new SnowRemoveRobot("sunny"));
	}
}

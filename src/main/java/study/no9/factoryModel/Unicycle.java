package study.no9.factoryModel;

public class Unicycle implements Cycle {
	private String message;
	public  Unicycle(String message) {
		this.message = message;
	}
	@Override
	public String run() {
		
		return "unicycle"+message;
	}

}

package study.no9.factoryModel;

public class Bicycle implements Cycle {
	private String message;
	public Bicycle(String message) {
		this.message = message;
	}
	@Override
	public String run() {
		return "Bicycle"+message;
	}

}

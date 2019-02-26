package study.no9.adapterModel;

public class Upcase extends StringProcessor {

	@Override
	public String process(Object input) {
		return input.toString().toUpperCase();
	}

}

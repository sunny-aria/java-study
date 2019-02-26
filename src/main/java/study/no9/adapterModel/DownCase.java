package study.no9.adapterModel;

public class DownCase extends StringProcessor {

	@Override
	public String process(Object input) {
		return input.toString().toLowerCase();
	}

}

package study.no9.adapterModel;

public abstract class StringProcessor implements Processor {

	@Override
	public String name() {
		return getClass().getSimpleName();
	}

	@Override
	public abstract String process(Object input);
	
	public static String s ="test ²ßÂÔÄ£Ê½ sss";
	
	public static void main(String[] args) {
		Apply.process(new Upcase(), s);
		Apply.process(new DownCase(), s);
	}

}

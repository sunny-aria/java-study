package study.no9.adapterModel;

public class StringFilter {
	public String name(){
		return "adapter StringFilter";
	}
	
	public String process(String s){
		return s.format("adapter_%s", s);
	}
}

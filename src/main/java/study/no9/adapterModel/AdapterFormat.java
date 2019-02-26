package study.no9.adapterModel;
/**
 * 适配器模式，必须包含转换类（接口）属性，继承需要实现的其他接口，
 * 利用属性接口进行转换，执行属性的方法
 * @author sdf
 *
 */
public class AdapterFormat implements Processor {
	private StringFilter filter; //filter 可以是接口，更灵活
	public AdapterFormat(StringFilter filter) {
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.name();
	}

	@Override
	public String process(Object input) {
		return filter.process(input.toString());
	}

}

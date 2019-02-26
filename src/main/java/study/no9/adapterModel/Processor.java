package study.no9.adapterModel;
/**
 * ÊÊÅäÆ÷Ä£Ê½
 * @author sdf
 *2016-10-25 7:09
 */
public interface Processor {
	String name();
	Object process(Object input);
}

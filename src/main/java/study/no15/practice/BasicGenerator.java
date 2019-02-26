package study.no15.practice;
/**
 * class<T> type 必须满足以下条件
 * 1.必须声明为public
 * 2.必须包含默认的构造器
 * BasicGenerator.java
 * @author sunny
 * 2016年12月14日上午7:53:21
 * @param <T>
 */
public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;
	
	public BasicGenerator(Class<T> type) {
		super();
		this.type = type;
	}

	@Override
	public T next() {
		try {
			return type.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<>(type);
	}
}

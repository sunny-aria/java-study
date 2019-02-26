package study.no15.practice.practice39;
/**
 * tuple 信使
 * TwoTuple.java
 * @author sunny
 * 2017年1月4日上午8:09:17
 * @param <S1>
 * @param <S2>
 */
public class TwoTuple<S1, S2> {
	 final S1 first;
	 final S2 second;
	
	public TwoTuple(S1 first, S2 second) {
		super();
		this.first = first;
		this.second = second;
	}
	public S1 getFirst() {
		return first;
	}
	public S2 getSecond() {
		return second;
	}
	
}

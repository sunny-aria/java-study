package study.no15.practice.practice42;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


/**
 * 将函数对象用作策略
 * Functional.java
 * @author sunny
 * 2017年1月9日上午8:27:05
 */
public class Functional {
	
	public static<T> T reduce(Iterable<T> seq,Combiner<T> combiner){
		Iterator<T> it = seq.iterator();
		if(it.hasNext()){
			T result = it.next();
			while(it.hasNext()){
				result = combiner.combine(result, it.next());
			}
			return result;
		}
		return null;
	}
	public static<T> Collector<T> forEach(Iterable<T> seq,Collector<T> func){
		for(T t:seq){
			func.function(t);
		}
		return func;
	}
	
	public static<R,T> List<R> transform(Iterable<T> seq,UnaryFunction<R,T> func){
		List<R> result = new ArrayList<R>();
		for(T t:seq){
			result.add(func.function(t));
		}
		return result;
	}
	
	public static<T> List<T> filter(Iterable<T> seq,UnaryPredicate<T> pred){
		List<T> result = new ArrayList<T>();
		for(T t:seq){
			if(pred.test(t)){
				result.add(t);
			}
		}
		return result;
	}
	/**
	 * 相加
	 * Functional.java
	 * @author sunny
	 * 2017年1月10日上午7:28:20
	 */
	static class IntegerAdder implements Combiner<Integer>{
		@Override
		public Integer combine(Integer x, Integer y) {
			return x+y;
		}
	}
	/**
	 * 整数相减
	 * Functional.java
	 * @author sunny
	 * 2017年1月10日上午7:28:43
	 */
	static class IntegerSubtracter implements Combiner<Integer>{
		@Override
		public Integer combine(Integer x, Integer y) {
			return x-y;
		}
	}
	
	static class BigDecimalAdder implements Combiner<BigDecimal>{
		@Override
		public BigDecimal combine(BigDecimal x, BigDecimal y) {
			return x.add(y);
		}
	}
	/**
	 * java.math.BigInteger
	 * Functional.java
	 * @author sunny
	 * 2017年1月10日上午7:32:18
	 */
	static class BigIntegerAdder implements Combiner<BigInteger>{
		@Override
		public BigInteger combine(BigInteger x, BigInteger y) {
			return x.add(y);
		}
	}
	static class AtomicLongAdder implements Combiner<AtomicLong>{
		@Override
		public AtomicLong combine(AtomicLong x, AtomicLong y) {
			return new AtomicLong(x.addAndGet(y.get()));
		}
	}
	
	static class BigDecimalUlp implements UnaryFunction<BigDecimal, BigDecimal>{

		@Override
		public BigDecimal function(BigDecimal x) {
			
			return x.ulp();
		}
		
	}
	static class GreaterThan<T extends Comparable<T>> implements UnaryPredicate<T>{
		private T bound;
		public GreaterThan(T bound){this.bound=bound;}
		@Override
		public boolean test(T x) {
			
			return x.compareTo(bound)>0;
		}
		
	}
	static class MultiplyingIntegerCollector implements Collector<Integer>{
		private Integer val =1;
		@Override
		public Integer function(Integer x) {
			val *=x;
			return val;
		}
		@Override
		public Integer result() {
			return val;
		}
	}
	/**
	 * 练习42
	 * Functional.java
	 * @author sunny
	 * 2017年1月10日上午8:19:24
	 */
	static class Pratice42Adder implements Combiner<Practice42>{
		private static int counter =1;
		@Override
		public Practice42 combine(Practice42 x, Practice42 y) {
			System.out.println(x+" "+y);
			Practice42 p = new Practice42(x.f()+y.f());
			System.out.println((counter++)+" "+p);
			return p;
		}
	}
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);
		Integer result = reduce(li, new IntegerAdder());
		System.out.println(result);
		result = reduce(li,new IntegerSubtracter());
		System.out.println(result);
		
		System.out.println(filter(li,new GreaterThan<Integer>(4)));
		System.out.println(forEach(li, new MultiplyingIntegerCollector()).result());
		System.out.println(forEach(filter(li,new GreaterThan<Integer>(4)),new MultiplyingIntegerCollector()).result());
		MathContext mc =new MathContext(7);
		List<BigDecimal> lbd = Arrays.asList(new BigDecimal(1.1,mc),
				new BigDecimal(2.2,mc),new BigDecimal(3.3,mc),new BigDecimal(4.4,mc));
		BigDecimal rdb = reduce(lbd, new BigDecimalAdder());
		System.out.println(rdb);
		System.out.println(filter(lbd,new GreaterThan<BigDecimal>(new BigDecimal(3))));
		System.out.println(transform(lbd, new BigDecimalUlp()));//相当于转换函数
		
		List<BigInteger> lbi = new ArrayList<BigInteger>();
		BigInteger bi = BigInteger.valueOf(11);
		for(int i=0;i<11;i++){
			lbi.add(bi);
			bi =bi.nextProbablePrime();
		}
		System.out.println(lbi);
		BigInteger rbi = reduce(lbi, new BigIntegerAdder());
		System.out.println(rbi);
		System.out.println(rbi.isProbablePrime(5));
		
		List<AtomicLong> lal = Arrays.asList(new AtomicLong(11),new AtomicLong(47),new AtomicLong(74),new AtomicLong(133));
		AtomicLong ral = reduce(lal, new AtomicLongAdder());
		System.out.println(ral);
		//练习42
		List<Practice42> lp = Arrays.asList(new Practice42(10),new Practice42(11),new Practice42(12),new Practice42(13));
		System.out.println(reduce(lp, new Pratice42Adder()));

	}

}
//不同类型的函数对象
interface Combiner<T> {T combine(T x,T y);}
interface UnaryFunction<R,T>{ R function(T x);}
interface Collector<T> extends UnaryFunction<T,T>{
	T result();
}
interface UnaryPredicate<T>{ boolean test(T x);}

class Practice42{
	private int a;
	public Practice42(int a){this.a =a;}
	public int f(){
		return a-1;
	}
	@Override
	public String toString() {
		return "Practice42 [a=" + a + "]";
	}
	
}

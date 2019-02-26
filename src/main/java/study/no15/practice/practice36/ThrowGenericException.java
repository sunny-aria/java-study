package study.no15.practice.practice36;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型应用于异常，可能会在一个方法的throws 子句中用到
 * ThrowGenericException.java
 * @author sunny
 * 2017年1月3日上午7:32:39
 */
public class ThrowGenericException {

	public static void main(String[] args) {
		ProcessRunner<String,Failure1,Failure2> pr = new ProcessRunner<String,Failure1,Failure2>();
		for(int i=0;i<3;i++){
			pr.add(new Processor1());
		}
		try {
			System.out.println(pr.processAll());
		} catch (Failure1 | Failure2 e) {
			e.printStackTrace();
		}
		
		ProcessRunner<Integer,Failure2,Failure3> pr2 = new ProcessRunner<Integer,Failure2,Failure3>();
		for(int i=0;i<3;i++){
			pr2.add(new Processor2());
		}
		try {
			System.out.println(pr2.processAll());
		} catch (Failure3 | Failure2 e) {
			e.printStackTrace();
		}
	}

}

interface Processor<T,E extends Exception,F extends Exception>{
	void process(List<T> resultCollector)throws E,F;
}

class ProcessRunner<T,E extends Exception,F extends Exception> extends ArrayList<Processor<T,E,F>>{
	List<T> processAll()throws E,F{
		List<T>  resultCollector = new ArrayList<T>();
		for(Processor<T,E,F> processor:this){
			processor.process(resultCollector);
		}
		return resultCollector;
	}
}

class Failure1 extends Exception{}
class Failure2 extends Exception{}
class Failure3 extends Exception{}

class Processor1 implements Processor<String,Failure1,Failure2>{
	static int count=4;
	@Override
	public void process(List<String> resultCollector) throws Failure1, Failure2 {
		if(count-->1){
			resultCollector.add("hep!");
		}else{
			resultCollector.add("ho!");
			throw new Failure2();
		}
		if(count<0){
			throw new Failure1();
		}
		
	}
	
}
class Processor2 implements Processor<Integer,Failure2,Failure3>{
	static int count =2;
	@Override
	public void process(List<Integer> resultCollector) throws Failure2, Failure3 {
		if(count--==0){
			resultCollector.add(47);
		}else{
			resultCollector.add(11);
			throw new Failure3();
		}
		if(count<0){
			throw new Failure2();
		}
	}
	
}




package study.no10.p1;

/**
 * 内部类可以访问外部类所有成员的访问权
 * Sequce.java
 * @author sunny
 *2016年10月27日上午7:47:57
 */
public class Sequce {
	private Object[] items;
	private int next =0 ;
	public Sequce(int size){items = new Object[size];}
	public void add(Object x){
		if(next <items.length){
			items[next++]=x;
		}
	}
	//内部类
	private class SequnceSelector implements  Selector{
		private int i =0;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i==items.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			if(i<items.length){i++;}
		}
		
		public Sequce getSequce(){
			return Sequce.this;
		}
		
		public void reverseSelector(){
			for(int j=items.length-1;j>0;j--){
				System.out.println(items[j]);
			}
		}
		
	}
	
	//获取一个selector
	public Selector getSelector(){
		return new SequnceSelector();
	}
	
	public SequnceSelector inner(){
		return new SequnceSelector();
	}
	
	public int size(){
		return items.length;
	}
	//测试
	public static void main(String[] args) {
		StrTest str = new StrTest();
		Sequce s = new Sequce(10);
		for(int i=0;i<10;i++){
//			s.add(str);
			s.add(str.toString()+i);
		}
		Selector se = s.getSelector();
		while(!se.end()){
			System.out.println(se.current());
			se.next();
		}
		Sequce.SequnceSelector sequnceSelector = s.inner();
		Sequce.SequnceSelector sequnceSelector1 = s.new SequnceSelector();
		System.out.println(sequnceSelector.getSequce().size());
		System.out.println(sequnceSelector1.getSequce().size());
		System.out.println("-----------------------");
		sequnceSelector.reverseSelector();
	}
}

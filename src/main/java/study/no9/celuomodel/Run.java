package study.no9.celuomodel;
/**
 * run.java ²ßÂÔÄ£Ê½
 * @author sunny
 * 2016-10-25 06:27
 */
public abstract class Run {
		public void name(){
			System.out.println(this.getClass().getName());
		}
		
		abstract void run();
}

package study.no13;

import java.util.Formatter;

/**
 * 练习4
 * Receipt.java
 * @author sunny
 * 2016年11月17日上午7:50:41
 */
public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	private static int WIDTH=5;
	String sa = "%-"+(WIDTH*3)+"s %"+WIDTH+"s %"+WIDTH*2+"s\n ";
	String sb = "%-"+(WIDTH*3)+"s %"+WIDTH+"s %"+WIDTH*2+".2f\n ";
	String sc = "%-"+(WIDTH*3)+".15s %"+WIDTH+"s %"+WIDTH*2+".2f\n ";
	
	public void printTitle(){
		f.format(sa, "Item","Qty","Price");
		f.format(sa, "----","--","-----");
	}
	public void print(String name,int qty,double price){
		f.format(sc, name,qty,price);
		total +=price;
	}
	private void printTotal(){
		f.format(sb, "Tax","",total*0.06);
		f.format(sa, "","","-----");
		f.format(sb, "Total","",total*1.06);
		
	}
	
	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}

}

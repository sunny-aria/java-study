package study.no17;

import java.util.BitSet;
import java.util.Random;

/**
 * 测试bitset 类
 * Bits.java
 * @author sunny
 * 2017年2月23日上午7:43:52
 */
public class Bits {

	public static void printBitSet(BitSet b){
		System.out.println("bits:"+b+" size:"+b.size());
		StringBuilder bbits = new StringBuilder();
		for(int j=0;j<b.size();j++){
			bbits.append(b.get(j)?"1":"0");
		}
		System.out.println("bit pattern:"+bbits);
		System.out.println("bit length:"+bbits.length());
	}
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		byte bt = (byte) rand.nextInt();
		BitSet bb = new BitSet();
		for(int i=7;i>=0;i--){
			if(((1<<i)&bt)!=0){
				bb.set(i);
			}else{
				bb.clear(i);
			}
		}
		System.out.println("byte value:"+bt);
		printBitSet(bb);
		
		short st = (short) rand.nextInt();
		BitSet bs = new  BitSet();
		for(int i=15;i>=0;i--){
			if(((1<<i)&st)!=0){
				bs.set(i);
			}else{
				bs.clear(i);
			}
		}
		System.out.println("short value:"+st);
		printBitSet(bs);
		
		int it = rand.nextInt();
		BitSet bi = new BitSet();
		for(int i=31;i>=0;i--){
			if(((1<<i )&it )!=0){
				bi.set(i);
			}else{
				bi.clear(i);
			}
		}
		System.out.println("int value:"+it);
		printBitSet(bi);
		
		BitSet b127 = new BitSet();
		b127.set(127);
		System.out.println("set b127:"+b127);
		printBitSet(b127);
		BitSet b255 = new BitSet(65);
		b255.set(255);
		System.out.println("set b255:"+b255);
		printBitSet(b255);
		BitSet b1023 = new BitSet(512);
		b1023.set(1023);
		b1023.set(1024);
		System.out.println("set b1023:"+b1023);
		printBitSet(b1023);
		
	}

}

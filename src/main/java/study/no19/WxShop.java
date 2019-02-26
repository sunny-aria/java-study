package study.no19;
/**
 * 模拟下单流程
 * WxShop.java
 * @author sunny
 * 2017年4月7日上午8:31:11
 */
public class WxShop {
	int counter =100;
	int id = counter;
	int cash;
	int integel;
	public WxShop(int cash,int integel){
		this.cash=cash;
		this.integel = integel;
	}
	public enum ShopEnum{
		REDUCE,
		REDUCEINTEGEL,
		CASH
	}
	public static void main(String[] args) {
		//TODO 使用EnumMap ，加策略模式实现//减库存，销积分，订单入库，送券
	}

}

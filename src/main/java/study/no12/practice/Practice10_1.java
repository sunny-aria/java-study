package study.no12.practice;

public class Practice10_1 {
	static int count = 0;
	static String STR = "10000";
	static class ThreeException extends Exception{}
	public static void main(String[] args) {

		while(true){
			
			try{
				//调用一个业务接口，模拟
				if("10001".equals(STR)){
					break;
				}else{
					count++;
					throw new ThreeException();
				}
			}catch(ThreeException e){
				System.out.println("error.");
			}finally{
				System.out.println("第"+count+" 次执行接口调用。");
				if(count==8) break; //模拟8次接口调用
			}
			
		}
	}

}

package study.no12.practice;

public class Practice22 {
	//构造过程中可能会抛出异常
	public Practice22() throws Exception{
	}
	
	//练习23
	public void dispose(){
		System.out.println("clear()");
	}
	
	public static void main(String[] args) {
		try {
			Practice22 p22 = new Practice22();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Practice22 p23  =new Practice22();
			try{
				//...
			}finally{
				p23.dispose(); //确保资源清理
			}
		}catch(Exception ex){
			ex.printStackTrace(System.err); //捕获构造器异常
		}
	}

}

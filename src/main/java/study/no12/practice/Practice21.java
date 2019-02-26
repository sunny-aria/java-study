package study.no12.practice;

public class Practice21 extends Practice21Base{

	/**
	 * 子类构造器不能捕获基类构造所抛出的异常。
	 * @throws Exception
	 */
	public Practice21() throws Exception  {
		super();
	}

	public static void main(String[] args) {
		try{
		Practice21Base p21 = new Practice21();
		}catch(Exception ex){
			ex.printStackTrace(System.err);
		}
	}

}

class Practice21Base{
	public Practice21Base() throws Exception{
	 throw new Exception("base Constructor exception.");
	}
}
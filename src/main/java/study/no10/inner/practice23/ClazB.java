package study.no10.inner.practice23;

public class ClazB {
	private  U23[] us =new U23[10];
	private int i=0;
	
	public void add(U23 u){
		if(i<us.length){
			us[i]=u;
			i++;
		}
	}
	
	public void remove(){
		us =null;
	}
	
	public void foru(){
		for(int j=0;j<us.length;j++){
			U23 u = us[j];
			u.ma();
			u.mb();
			u.mc();
		}
	}
	
	public static void main(String[] args) {
		ClazB b = new ClazB();
		for(int i =0;i<10;i++){
			ClazA a = new ClazA();
			U23 u = a.u23();
			b.add(u);
		}
		
		b.foru();
	}
}

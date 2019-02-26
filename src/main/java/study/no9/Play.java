package study.no9;

public class Play {
	static void play(Playable[] p){
		for(Playable pp:p){
			play(pp);
		}
	}
	
	static void play(Playable p){
		p.play();
	}
	public static void main(String[] args) {
		Playable[] p = { new PlayA(),new PlayB()};
		play(p);
	}

}

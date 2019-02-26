package study.no11.practice;

import java.util.ArrayList;
import java.util.List;

public class CollectionSequenceTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10;i++){
			list.add(i+" test list .");
		}
		CollectionSequence cs = new CollectionSequence();
		cs.setList(list);
		
		InterfaceVsIterator.display(cs);
	}

}

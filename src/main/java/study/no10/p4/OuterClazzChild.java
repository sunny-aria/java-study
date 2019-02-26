package study.no10.p4;

import study.no10.p2.Destination;
import study.no10.p3.OuterClazz;

public class OuterClazzChild extends OuterClazz {
	public Destination destination(){
		return new InnerClazz();
	}
}

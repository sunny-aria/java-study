package study.no10.p3;

import study.no10.p2.Destination;

public class OuterClazz {
	
	
	public class InnerClazz implements  Destination{

		public InnerClazz() {
		}

		@Override
		public String des() {
			return "destination";
		}
		
	}
	
}

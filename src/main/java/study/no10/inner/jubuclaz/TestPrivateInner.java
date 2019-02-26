package study.no10.inner.jubuclaz;

import study.no10.p2.Destination;

public class TestPrivateInner {

	public static void main(String[] args) {
		JubuClaz jb = new JubuClaz();
		//测试内部类向下转型时，private inner class 被完全藏匿
		Destination des = jb.getChuanTongInner();
		System.out.println(des.des());
	}

}

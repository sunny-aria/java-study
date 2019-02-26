package study.no20;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class HashSetExampleTest extends HashSet<String>{
	
	static HashSetExampleTest testObject =null;
	static{
		testObject = new HashSetExampleTest();
	}
	@Test
	public void test() {
		assert testObject.isEmpty();
	}
	
	@Test
	public void _contain(){
		testObject.add("one");
		assertTrue(testObject.contains("one"));
	}

}

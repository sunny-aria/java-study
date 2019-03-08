package study.no20;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

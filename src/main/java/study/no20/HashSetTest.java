package study.no20;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * 组合方式使用测试注解
 * HashSetTest.java
 * @author sunny
 * 2017年4月11日上午8:36:25
 */
public class HashSetTest {
	HashSet<String> testObject = new HashSet<>();
	@Test
	public void initialization(){
		assertTrue(testObject.isEmpty());
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void _contains(){
		testObject.add("one");
		assert testObject.contains("one");
	}
}

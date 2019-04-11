package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void addTest() {
		JUnitClass junit = new JUnitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result);
	
	}
	
	
	@Test 
	public void equation() {
		JUnitClass junit = new JUnitClass();
		int result = junit.equation(2, 50, 100);
		assertEquals(2, result);
	}

}

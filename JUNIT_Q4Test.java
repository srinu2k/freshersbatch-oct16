import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtillTest
{	
	MathUtill hooks;
	@BeforeAll
	static void beforeAll() {
		System.out.println("Running before all....");
	}
	
	@BeforeEach
	void init() {
		hooks=new MathUtill();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Running After each method..");
	}
	@Test
	void testadd() 
	{
		int expected=5; 
		int actual = hooks.add(5, 10);
		assertEquals(expected,actual,"should add two numbers");
	}
	@Test
	void testsub() 
	{
		int expected=-5; 
		int actual = hooks.sub(5, 10);
		assertEquals(expected,actual,"should substract two numbers");
	}

	@Test
	void testmul() 
	{
		int expected=50; 
		int actual = hooks.multiply(5, 10);
		assertEquals(expected,actual,"should multiply two numbers");
	}
	@AfterAll
	static void afterAll()
	{
		System.out.println("Running after all....");
	}
	

}

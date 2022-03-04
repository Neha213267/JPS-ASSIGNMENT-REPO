package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)



class MathUtilsTest {
	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeAllInit(){
		System.out.print("Initialising before class.......");
	}
	@BeforeEach
	void init() {
		 mathUtils = new MathUtils();
		
	}
	@AfterAll
	public static void cleanUp(){
        System.out.print("After All cleanUp() method called");
    }
    @AfterEach
    void cleanup() {
    	System.out.print("Cleaning up.....");
    }
	@Test
	@DisplayName("Testing add method")
	void test() {
		
		int expected=2;
		int actual=mathUtils.add(1 ,1);
		assertEquals(expected,actual,"Don't you know addition");
	}
	@Test
	
	void testDivide() {
		assumeTrue(true);
		
		assertThrows(ArithmeticException.class ,() ->mathUtils.divide(1, 0),"Divide by zero should throw");
		
	}
	
	
	@Test
	void testcomputeCircleRadius() {
		
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),"This returns circle area");
		
	}
	
	@Test
	@Disabled
	@DisplayName("This test should not run")
		void testDisabled() {
			fail("This test should fail");
		}
	
	
	

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
			//add
			int a = 4321;
			int b = 1234;
			//
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 
			// 
			int expected = 5555;
			assertEquals (expected, actual);
			}
	
	@Test 
	public void testSubtract() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.sub(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		}

	@Test
	public void testMultiply() {
		int a = 3;
		int b = 5;
			
		Calculator cal = new Calculator();
		int actual = cal.mul(a, b); 
			 
		int expected = 15;
		assertEquals (expected, actual);
		}
	@Test
	public void testDivide() {
		int a = 6;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.div(a, b); 
			 
		int expected = 3;
		assertEquals (expected, actual);
		}
	
	public void testDivideWith0Denominator () { 
		try { 
			Calculator cal = new Calculator(); 
			cal.divide(a , c);
			fail("Expected an IllegalArgumentException to be thrown");
			}catch(IllegalArgumentException e) {
				assertEquals("Division by zero is not supported", e.getMessage() );
			}catch(Throwable t) {
				assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
				
			}
	}
		}
	
	

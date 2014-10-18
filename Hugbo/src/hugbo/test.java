package hugbo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;


public class test {
	
		@Test
		public void testEmptyString()
		{ 
			Calculator calc = new Calculator();
			assertEquals(0, calc.add(""));
		}
		
		@Test
		public void testOneNumber()
		{
			Calculator calc = new Calculator();
			assertEquals(2, calc.add("2"));
		}
		
		@Test 
		public void testTwoNumbers()
		{
			Calculator calc = new Calculator();
			assertEquals(8, calc.add("6,2"));
		}
		
		@Test
		public void testManyArguments()
		{
			Calculator calc = new Calculator();
			assertEquals(9, calc.add("6,2,1"));

		}
		
	
}

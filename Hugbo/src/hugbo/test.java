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
		
//		@Test
//		public void testOneNumber()
//		{
//			Calculator calc = new Calculator();
//			assertEquals(1, calc.add("1"));
//		}
		
		
	
}

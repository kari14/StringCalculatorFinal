package hugbo;

import static org.junit.Assert.assertEquals;

import java.security.PublicKey;

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
		
		@Test
		public void testNewLine()
		{
			Calculator calc = new Calculator();
			assertEquals(3,calc.add("1\n2"));
		}
		
		@Test
		public void testNewLineAndComma()
		{
			Calculator calc = new Calculator();
			assertEquals(6, calc.add("1\n2,3"));
		}
		
		@Test
		public void testDelimeter()
		{
			Calculator calc = new Calculator();
			assertEquals(3, calc.add("//;\n1;2"));
		}
		
	
}

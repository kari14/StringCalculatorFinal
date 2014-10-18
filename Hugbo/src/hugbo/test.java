package hugbo;

import static org.junit.Assert.assertEquals;

import java.security.PublicKey;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.rules.ExpectedException;


public class test {
	
		@Test
		public void testEmptyString() throws Exception
		{ 
			Calculator calc = new Calculator();
			assertEquals(0, calc.add(""));
		}
		
		@Test
		public void testOneNumber() throws Exception
		{
			Calculator calc = new Calculator();
			assertEquals(2, calc.add("2"));
		}
		
		@Test 
		public void testTwoNumbers() throws Exception
		{
			Calculator calc = new Calculator();
			assertEquals(8, calc.add("6,2"));
		}
		
		@Test
		public void testManyArguments() throws Exception
		{
			Calculator calc = new Calculator();
			assertEquals(9, calc.add("6,2,1"));

		}
		
		@Test
		public void testNewLine() throws Exception
		{
			Calculator calc = new Calculator();
			assertEquals(3,calc.add("1\n2"));
		}
		
		@Test
		public void testNewLineAndComma() throws Exception
		{
			Calculator calc = new Calculator();
			assertEquals(6, calc.add("1\n2,3"));
		}
		
		@Test
		public void testDelimeter() throws Exception
		{
			Calculator calc = new Calculator();
			assertEquals(3, calc.add("//;\n1;2"));
		}
		
		@Test(expected=Exception.class)
		public void negativeInput() throws Exception
		{
			Calculator calc = new Calculator();
			calc.add("-23");
		}
		
		@Test
		public void noNumberLargerThan1000() throws Exception
		{
			Calculator calc = new Calculator();
			assertEquals(2, calc.add("1001,2"));
		}
		
	
}

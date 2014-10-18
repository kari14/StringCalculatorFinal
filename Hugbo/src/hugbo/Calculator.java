package hugbo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	
	public static int add(String text)
	{
		if(text.startsWith("//"))
		{
			return sum(delimeter(text));
		}
		else if(text.equals(""))
		{
			return 0;
		}
		else if(text.contains(",") || text.contains("\n"))
		{	
			return sum(splitNumbers(text));
		}
		else
		{
			return Integer.parseInt(text);
		}	
	}
	
	private static String[] delimeter(String numbers)
	{
		Matcher regex = Pattern.compile("//(.)\n(.*)").matcher(numbers);
		regex.matches();
		String delimeter = regex.group(1);
		String textToInts = regex.group(2);
		return textToInts.split(delimeter);
	}
	
	private static String[] splitNumbers (String numbers)
	{
		return numbers.split(",|\n");
	}
	
	private static int sum(String[] numbers)
	{
		int total = 0;
		for(String number : numbers)
		{
			total += Integer.parseInt(number);	
		}
		return total;
	}
}

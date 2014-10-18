package hugbo;

public class Calculator {
	
	public static int add(String text)
	{
		if(text.equals(""))
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

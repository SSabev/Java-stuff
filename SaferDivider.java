public class SaferDivider
{
	public static void main(String[] args)
	{
		Double num = Double.parseDouble(args[0]);
		Double denom = Double.parseDouble(args[1]);
		if (denom == 0.0)
		{
			System.out.println("I can't divide by zero!");
		}
		else System.out.println(num/denom);
		
	}
}
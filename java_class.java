public class Foo 
{
	public static void main ( String [] args ) 
	{
		int a = 10; 
		int x = 6; 
		int [] b = { 10, 3, 5, 6, 11};
		for ( int i = 1; i < a; i++ ) 
		{
			if ( b[i] == x ) 
			{
				System.out.println(x + " was first found at " + i);
				break;
			}
		}
	}
}


public class SumOddsEvens 
{
	public static void main( String [] args )
	{
		int sumEven = 0;
		int sumOdd = 0;
		for ( int i = 0; i < args.length; i++ )
		{
			int temp = Integer.parseInt(args[i]);
     		if ( temp % 2 == 0 ) 
     		{
     			sumEven += temp; 
     		}
			else 
			{
				sumOdd += temp;
			}
		}
		System.out.println("The sum of the even numbers is: " + sumEven);
		System.out.println("The sum of the odd numbers is: " + sumOdd);
	}
}
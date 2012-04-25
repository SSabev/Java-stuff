public class Factorial
{
    public static int factorial(int N)
    {
		int fact = 1;
		
		if( N == 1) return 1;
		else
		{
			fact = N*factorial(N-1);
		}
		
		return fact;
					  
    }
	
    public static void main(String[] args)
    {
        System.out.println(" 2! (Should be: 2) returned: " + factorial(1) );
        System.out.println(" 5! (Should be: 120) returned: " + factorial(5) );
        System.out.println(" 10! (Should be: 3628800) returned: " + factorial(10) );
    }
}
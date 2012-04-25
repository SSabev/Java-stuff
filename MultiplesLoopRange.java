public class MultiplesLoopRange
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if (a > b) 
		{
			for(int count=a; count>=b; count--)
			{
				if (count%c == 0) {
					System.out.print(count + " ");
				}
			}
			
		}
		
		else
		{
			for(int count=a; count<=b; count++)
			{
				if (count%c == 0) {
					System.out.print(count + " ");
				}
			}
			
		}
		
		
		System.out.println();
	}
}
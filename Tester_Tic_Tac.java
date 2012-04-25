public class Tester_Tic_Tac
{
	public static void main(String[] args)
	{
		int None = 0;
		int Noughts = 1;
		int Crosses = 2;
		int[][] table = 
		{		{None,    None,    Crosses },
				{None, 	  Crosses, None },
				{Crosses, None,    None },
		};
		NoughtsAndCrosses nc = new NoughtsAndCrosses( table );
		
		if ( nc.isDraw() == false )
			System.out.println("true");
		if ( nc.whoWon() == Crosses)
			System.out.println("Crosses");
			
	}
}
public class NoughtsAndCrosses
{
	int[][] plboard = new int[3][3];
	
	public NoughtsAndCrosses(int[][] board)
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				plboard[i][j] = board[i][j];
			}
		}
	}
	
	public boolean isDraw()
	{
		if (!(plboard[0][0] == plboard[0][1] && plboard[0][1] == plboard[0][2] && plboard[0][0] == plboard[0][2] && plboard[0][0]!=0) &&
			!(plboard[1][0] == plboard[1][1] && plboard[1][1] == plboard[1][2] && plboard[1][0] == plboard[1][2] && plboard[1][0]!=0) &&
			!(plboard[2][0] == plboard[2][1] && plboard[2][1] == plboard[2][2] && plboard[2][0] == plboard[2][2] && plboard[2][0]!=0) &&
			!(plboard[0][0] == plboard[1][0] && plboard[1][0] == plboard[2][0] && plboard[0][0] == plboard[2][0] && plboard[0][0]!=0) &&
			!(plboard[0][1] == plboard[1][1] && plboard[1][1] == plboard[2][1] && plboard[0][1] == plboard[2][1] && plboard[0][1]!=0) &&
			!(plboard[0][2] == plboard[1][2] && plboard[1][2] == plboard[2][2] && plboard[0][2] == plboard[2][2] && plboard[0][2]!=0) &&
			!(plboard[0][0] == plboard[1][1] && plboard[1][1] == plboard[2][2] && plboard[0][0] == plboard[2][2] && plboard[0][0]!=0) && 
			!(plboard[2][0] == plboard[1][1] && plboard[1][1] == plboard[0][2] && plboard[2][0] == plboard[0][2] && plboard[2][0]!=0))
			return true;
		else return false;			
	}
	
	public int whoWon()
	{
		if ((plboard[0][0] == plboard[0][1]) && (plboard[0][1] == plboard[0][2]) && (plboard[0][0] == plboard[0][2]) && plboard[0][0] == 1 )
			return 1;
		
		if ((plboard[0][0] == plboard[0][1]) && (plboard[0][1] == plboard[0][2]) && (plboard[0][0] == plboard[0][2]) && plboard[0][0] == 2 )
			return 2;
		
		if ((plboard[1][0] == plboard[1][1]) && (plboard[1][1] == plboard[1][2]) && (plboard[1][0] == plboard[1][2]) && plboard[1][0] == 1 )
			return 1;
		
		if ((plboard[1][0] == plboard[1][1]) && (plboard[1][1] == plboard[1][2]) && (plboard[1][0] == plboard[1][2]) && plboard[1][0] == 2 )
			return 2;
		
		if ((plboard[2][0] == plboard[2][1]) && (plboard[2][1] == plboard[2][2]) && (plboard[2][0] == plboard[2][2]) && plboard[2][0] == 1 )
			return 1;
		
		if ((plboard[2][0] == plboard[2][1]) && (plboard[2][1] == plboard[2][2]) && (plboard[2][0] == plboard[2][2]) && plboard[2][0] == 2 )
			return 2;
		
		if ((plboard[0][0] == plboard[1][0]) && (plboard[1][0] == plboard[2][0]) && (plboard[0][0] == plboard[2][0]) && plboard[0][0] == 1 )
			return 1;
		
		if ((plboard[0][0] == plboard[1][0]) && (plboard[1][0] == plboard[2][0]) && (plboard[0][0] == plboard[2][0]) && plboard[0][0] == 2 )
			return 2;
		
		if ((plboard[0][1] == plboard[1][1]) && (plboard[1][1] == plboard[2][1]) && (plboard[0][1] == plboard[2][1]) && plboard[0][1] == 1 )
			return 1;
		
		if ((plboard[0][1] == plboard[1][1]) && (plboard[1][1] == plboard[2][1]) && (plboard[0][1] == plboard[2][1]) && plboard[0][1] == 2 )
			return 2;
	
		if ((plboard[0][2] == plboard[1][2]) && (plboard[1][2] == plboard[2][2]) && (plboard[0][2] == plboard[2][2]) && plboard[0][2] == 1 )
			return 1;
		
		if ((plboard[0][2] == plboard[1][2]) && (plboard[1][2] == plboard[2][2]) && (plboard[0][2] == plboard[2][2]) && plboard[0][2] == 2 )
			return 2;
		
		if ((plboard[0][0] == plboard[1][1]) && (plboard[1][1] == plboard[2][2]) && (plboard[0][0] == plboard[2][2]) && plboard[0][0] == 1 )
			return 1;
		
		if ((plboard[0][0] == plboard[1][1]) && (plboard[1][1] == plboard[2][2]) && (plboard[0][0] == plboard[2][2]) && plboard[0][0] == 2 )
			return 2;
		
		if ((plboard[2][0] == plboard[1][1]) && (plboard[1][1] == plboard[0][2]) && (plboard[2][0] == plboard[0][2]) && plboard[2][0] == 1 )
			return 1;
		
		if ((plboard[2][0] == plboard[1][1]) && (plboard[1][1] == plboard[0][2]) && (plboard[2][0] == plboard[0][2]) && plboard[2][0] == 2 )
			return 2;
		else return 0;
	}
}
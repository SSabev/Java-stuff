public class Interval
{
	private double left_bound;
	private double right_bound;
	
	public Interval(double left, double right)
	{
		left_bound = left;
		right_bound = right;
	}
	
	public boolean doesContain(double x)
	{
		if ( left_bound < x && x < right_bound )
		{
			return true;
		}
		else return false;
	}
	
	public boolean intersects(Interval b)
	{
		if (left_bound < right_bound)
		{
			if (left_bound <= b.left_bound && right_bound <= b.right_bound && b.left_bound <= right_bound)
			{
				return true;
			}
			else if (left_bound >= b.left_bound && right_bound >= b.right_bound && b.right_bound >= left_bound) 
			{
				return true;
			}
			else return false;
		}
		else return false;
		
	}
	
	public String toString()
	{
		String s = "";
		
		if ( left_bound > right_bound )
		{
			s = "Interval: (EMPTY)";
		}
		else s = "Interval: (" + left_bound + "," + right_bound + ")";
		
		return s;
		
	}
}





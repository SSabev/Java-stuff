public class test_interval
{
	public static void main(String[] args)
	{
		Interval interval = new Interval(5.,10.);
		
		if(interval.intersects( new Interval(7., 12.)))
		{
			System.out.println("true");
		}
		else System.out.println("false");
		
		
		if(interval.intersects( new Interval(9., 14.)))
		{
			System.out.println("true");
		}
		else System.out.println("false");
		
		if(interval.intersects( new Interval(1., 5.0)))
		{
			System.out.println("true");
		}
		else System.out.println("false");
		
		
		if(interval.intersects( new Interval(1., 4.)))
		{
			System.out.println("true");
		}
		else System.out.println("false");
		
		
		if(interval.intersects( new Interval(10.1, 14.)))
		{
			System.out.println("true");
		}
		else System.out.println("false");
	}
}
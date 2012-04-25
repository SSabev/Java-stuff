public class Test_Rectangle
{
	public static void main (String[] args)
	{
		Rectangle r  = new Rectangle( new Point2DDouble(20,200), new Point2DDouble(40,220)  );
		
		if (r.isPointInside( new Point2DDouble(21,201)))
		{
			System.out.println("true");
		}else System.out.println("false");
		if (( r.isPointInside( new Point2DDouble(21,219) ) ))
		{
			System.out.println("true");
		}else System.out.println("false");
		if (r.isPointInside( new Point2DDouble(19,201) ))
		{
			System.out.println("true");
		}else System.out.println("false");
		if (r.isPointInside( new Point2DDouble(41,219) ))
		{
			System.out.println("true");
		}else System.out.println("false");
	}
}
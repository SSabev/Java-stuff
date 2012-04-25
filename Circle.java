public class Circle
{
	Point2DDouble centre_circ;
	double radius_circ;
	
	public Circle(Point2DDouble centre, double radius)
	{
		centre_circ = centre;
		radius_circ = radius;
	}
	
	public boolean isPointInside(Point2DDouble pt)
	{
		double dist = Math.sqrt((pt.getX() - centre_circ.getX())*(pt.getX() - centre_circ.getX()) + (pt.getY() - centre_circ.getY())*(pt.getY() - centre_circ.getY()));
		if ( dist <= radius_circ )
		{
			return true;
		}
		else return false;
	}

}
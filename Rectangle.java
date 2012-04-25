public class Rectangle
{
	Point2DDouble top_left;
	Point2DDouble bottom_right;

	public Rectangle(Point2DDouble topleft, Point2DDouble bottomright)
	{
		top_left = topleft;
		bottom_right = bottomright;
	}
	
	public boolean isPointInside(Point2DDouble pt)
	{
		double top_x = top_left.getX();
		double top_y = top_left.getY();
		double bottom_x = bottom_right.getX();
		double bottom_y = bottom_right.getY();
		double x_cord = pt.getX();
		double y_cord = pt.getY();

		if ( top_x < x_cord && x_cord < bottom_x && top_y < y_cord && y_cord < bottom_y )
			return true;
		else return false;
	}
}
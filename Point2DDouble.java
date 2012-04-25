public class Point2DDouble {
	
    private double x, y;
	
    public Point2DDouble(double x, double y) {
        this.x = x;
        this.y = y;
    }
	
    public double getR() {
		return Math.sqrt(x*x + y*y);
    }
	
    public double getX() {
		return x;
    }
	
    public double getY() {
		return y;
    }
	
    static Point2DDouble subtract(Point2DDouble lhs, Point2DDouble rhs) {
		return new Point2DDouble(lhs.getX() - rhs.getX(), lhs.getY() - rhs.getY());
    }
	
    static Point2DDouble add(Point2DDouble lhs, Point2DDouble rhs) {
		return new Point2DDouble(lhs.getX() + rhs.getX(), lhs.getY() + rhs.getY());
	}
}
		
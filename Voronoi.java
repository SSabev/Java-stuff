import java.awt.Color;

public class Voronoi
{
	
	public static void main(String[] args )
	{
		int width = 200;
		int height = 200;
		
		int nPoints = 5;
		Point2D[] points = new Point2D[nPoints];
		points[0] = new Point2D( 50,50 );
		points[1] = new Point2D( 100,50);
		points[2] = new Point2D( 50,100);
		points[3] = new Point2D( 125,50);
		points[4] = new Point2D( 100,175);
		
		Color[] colors = new Color[nPoints];
		colors[0] = Color.BLUE;
		colors[1] = Color.GREEN;
		colors[2] = Color.YELLOW;
		colors[3] = Color.ORANGE;
		colors[4] = Color.MAGENTA;
		
		int[][] indexmap = buildVoronoiMap(points, width,height);
		plotVoroniMap( points, colors, indexmap);
	}
	
	
	public static double pointDist( Point2D pt, Point2D pt2)
	{
		int x1 = pt.getX();
		int y1 = pt.getY();
		int x2 = pt2.getX();
		int y2 = pt2.getY();
		double dist = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		
		return dist;
	}
	
	public static int findClosestPoint( Point2D pt, Point2D[] pts)
	{
		double[] dists = new double[pts.length];
		
		for(int i = 0; i < pts.length; i++)
		{
			dists[i] = pointDist(pt, pts[i]);
		}
		
		double smallest_dist_index = 32768.0;
		int var_num=0;
		
		for(int i = 0; i < pts.length; i++)
		{
			if ( smallest_dist_index > dists[i])
			{
				smallest_dist_index = dists[i];
				var_num = i;
			}
		}
		
		return var_num;
	}
	
	public static int[][] buildVoronoiMap( Point2D[] points, int width, int height)
	{
		int [][] a = new int[width*height][width*height];
		
		for ( int i = 0; i < width*height; i++ )
		{
			a[][i] = 
		}
	}
	
	
	public static void plotVoroniMap( Point2D[] points, Color[] colors, int[][] indexMap )
	{
		// to implement...
	}
	
}
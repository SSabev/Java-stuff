public class CoordinateConverter
{
	public static double convertXYtoR(double x, double y)
  	{
  		Double big_r = Math.sqrt(x*x+y*y);
		return big_r;
 	}
 	
 	public static double convertXYtoT(double x, double y)
  	{
  		Double theta = Math.atan2(y,x);
  		return theta;
  	}

	public static double convertRTtoX(double r, double theta)
  	{
  		Double x = r*Math.sin(theta);
  		return x;
  	}

  	public static double convertRTtoY(double r, double theta)
  	{
  		Double y = r*Math.cos(theta);
  		return y;
    }

	public static double convertDegToRad( double deg)
  	{
  		Double rad = deg * Math.PI/180;
  		return rad;
  	}

  	public static double convertRadToDeg( double rad)
  	{
      	Double deg = 180*rad/Math.PI;
      	return deg;
  	}
  	
}
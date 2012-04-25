public class Vector3D
{
	private double x_cord;
	private double y_cord;
	private double z_cord;
	
    public Vector3D( double x, double y, double z )
    {
		x_cord = x;
		y_cord = y;
		z_cord = z;
	}
	
    public double getR()
    {
        double R = Math.sqrt(x_cord*x_cord + y_cord*y_cord + z_cord*z_cord);
		
		return R;
    }
	
    public double getTheta()
    {
        double theta = Math.acos(z_cord/getR());
		
		return theta;
    }
	
    public double getPhi()
    {
        double phi = Math.atan(y_cord/x_cord);
		
		return phi;
    }
	
    public static Vector3D add( Vector3D lhs, Vector3D rhs)
    {
		Vector3D vec = new Vector3D(lhs.x_cord + rhs.x_cord,lhs.y_cord + rhs.y_cord,lhs.z_cord + rhs.z_cord);
		
		return vec;
    }
	
    public static Vector3D subtract( Vector3D lhs, Vector3D rhs)
    {
		Vector3D vec = new Vector3D(lhs.x_cord - rhs.x_cord,lhs.y_cord - rhs.y_cord,lhs.z_cord - rhs.z_cord);
		
		return vec;
    }
	
    public static Vector3D scale( Vector3D lhs, double scaleFactor)
    {
		Vector3D vec = new Vector3D(lhs.x_cord*scaleFactor,lhs.y_cord*scaleFactor,lhs.z_cord*scaleFactor);
		
		return vec;
    }
}
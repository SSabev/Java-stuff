public class Sigmoid
{
	public static double sigmoid(double x)
	{
		double n = 1.0/(Math.exp(-x) + 1.0);
		
		return n;
	}
	
	public static double[] arange(double start, double stop, double step)
	{
		double num_xs = (Math.abs(start)+Math.abs(stop))/step;
		double[] xs = new double[(int)num_xs + 1];
		int k = 0;
		
		for ( double i = start; i < stop; i += step )
		{
			xs[k] = i;
			k++;
		}
		
		return xs;
	}
	
	public static void plotGraph(double[] xs, double[] ys) 
	{
		for (int i = 0; i < xs.length; i++) 
		{
			double x = xs[i];
			double y = ys[i];
			StdDraw.setXscale(-10, 10);
			StdDraw.setYscale(-1, 1);
			StdDraw.setPenRadius(.005);
			StdDraw.point(x, y);
		}
	}
	
	public static double[] calculateSigmoidArray(double[] xs) 
	{
		double[] a = new double[xs.length];
		
		for ( int i = 0; i < xs.length; i++)
		{
			a[i] = sigmoid(xs[i]);
		}
		
		return a;
	}
	
	public static double[] calculateSineArray(double[] xs, double omega) 
	{
		double[] b = new double[xs.length];
		
		for ( int i = 0; i < xs.length; i++ )
		{
			b[i] = Math.sin(omega*xs[i]);
		}
		
		return b;
	}
	
	public static void main(String[] args) 
	{
		double[] xs = arange(-10, 10, 0.1);
		double[] ys = calculateSineArray(xs, 1);
		
		plotGraph(xs, ys);
	}

}
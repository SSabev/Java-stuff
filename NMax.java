public class NMax
{
	public static int max(int a, int b, int c)
	{
		if(a < c && b < c) return c;
		else if(c < b && a < b) return b;
		else return a;
	}
	
	public static double max(double a, double b, double c)
	{
		if(a < c && b < c) return c;
		else if(c < b && a < b) return b;
		else return a;
	}
	
	public static void main(String[] args)
	{
		int N = 3;
		double[] a = new double[N];
		for (int i = 0; i < N; i++)
		{
        	a[i] = StdIn.readDouble();
    	}
    	System.out.println(max(a[0], a[1], a[2]));
	}
}
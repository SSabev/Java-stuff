public class MeanVariance{
	public static void main(String[] args)
	{
		double [] a = new double[args.length];
		double sum = 0.0;
		for( int i = 0; i < args.length; i++)
		{
			a[i] = Double.parseDouble(args[i]);
			sum = sum + a[i];
		}
		double k = 0.0;
        for (int i = 0; i < args.length; i++) {
            k += (a[i] - (sum/a.length)) * (a[i] - (sum/a.length));
        }
        double variance = k / (args.length - 1);
		System.out.println(sum/a.length);
		System.out.println(variance);
	}	
}
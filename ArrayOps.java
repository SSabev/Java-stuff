public class ArrayOps
{
    static public double findMax( double[] data)
    {
		double n = -32768.0;
		
		for (int i = 0; i < data.length; i++)
		{
			if (n < data[i])
			{
				n = data[i];
			}
		}
		
		return n;
		
    }
	
    static public void swap( double[] data1, double[] data2)
    {
		for ( int i = 0; i < data1.length; i++)
		{
			double c = data1[i];
			data1[i]=data2[i];
			data2[i]=c;
		}
    }
	
    static public void normaliseInPlace( double data[] )
    {
		double sum = 0.0;
		
		for ( int i = 0; i < data.length; i++ )
		{
			sum += data[i];
		}
		
		for ( int i = 0; i < data.length; i++ )
		{
			data[i] /= sum;
		}
		
    }
	
    static public void reverseInPlace( double[] data)
    {
		int left  = 0;
		int right = data.length-1; 
		
		while (left < right) {
			double temp = data[left]; 
			data[left]  = data[right]; 
			data[right] = temp;
			left++;
			right--;
		}
    }
	
	static public double[] normalise( double data[] )
    {
		double sum = 0.0;
		double[] a = new double[data.length];
		
		for ( int i = 0; i < data.length; i++ )
		{
			sum += data[i];
			a[i] = data[i];
		}
		
		for ( int i = 0; i < data.length; i++ )
		{
			a[i] /= sum;
		}
		
		return a;
    }
	
    static public double[] reverse( double[] data)
    {
		double[] a = new double[data.length];
		
		for ( int i = 0; i < data.length; i++ )
		{
			a[data.length-i-1] = data[i];
		}
		
		return a;
    }
	public static void main(String[] args)
	{
		double[] a = {1.0,2.0,3.0};
		reverse(a);
	}
}
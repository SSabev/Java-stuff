public class IsTriangular
{
	public static boolean isTri(double a, double b, double c)
	{
		if ( a + b > c && a + c > b && b + c > a) return true;
		else return false;
	}
	
	public static void main(String[] args) 
	{
		int N = 3;
    	double[] input = new double[N];
    	for (int i = 0; i < N; i++) {
        	input[i] = StdIn.readDouble();
    	}
    	double a = input[0], b = input[1], c = input[2];
    	if (isTri(a, b, c))
            System.out.printf("%s, %s and %s could be the lengths of a triangle\n", a, b, c);
    	else System.out.printf("Not a triangle.\n");
	}
}
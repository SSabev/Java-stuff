public class SqrtClassTester
{
	
		public static double[] arrange(double start, double stop, double step)
		{
			int N = 0;
			if (start >= stop)
			{
				return new double[0];
			}
			else 
			{
				N = (int) ((stop - start) / step) + 1;
			}
			double[] result = new double[N];
			for (int i = 0; i < N; i++) 
			{
				result[i] = start + i * step;
			}
			return result;
        }
		
		public static boolean areWithinEpsilon(double a, double b, double epsilon)
		{
			if ( a > b )
			{
				if ( a - b >= epsilon ) return false;
			}
			else if ( a < b )
			{
				if ( b - a >= epsilon ) return false;
			}
			return true;
		}
		
		
		public static boolean testGood(double[] testArray, double epsilon)
		{
			for (int i = 0; i < testArray.length; i++)
			{
				if (areWithinEpsilon(GoodSquareRoot.sqrt(testArray[i]), Math.sqrt(testArray[i]), epsilon) == false)
				{
					System.out.print("GoodSqrt - Not valid within: ");
					if (GoodSquareRoot.sqrt(testArray[i]) > Math.sqrt(testArray[i])) 
					{
						System.out.print(GoodSquareRoot.sqrt(testArray[i]) - Math.sqrt(testArray[i]));
					}
					else System.out.print(Math.sqrt(testArray[i]) - GoodSquareRoot.sqrt(testArray[i]));
					return false;
				}
				
			}
			
			return true;
		}
		
		public static boolean testBad(double[] testArray, double epsilon)
		{
			for (int i = 0; i < testArray.length; i++)
			{
				if (areWithinEpsilon(BadSquareRoot.sqrt(testArray[i]), Math.sqrt(testArray[i]), epsilon) == false)
				{
					System.out.print("BadSqrt - Not valid within: ");
					if (BadSquareRoot.sqrt(testArray[i]) > Math.sqrt(testArray[i])) 
					{
						System.out.print(BadSquareRoot.sqrt(testArray[i]) - Math.sqrt(testArray[i]));
					}
					else System.out.print(Math.sqrt(testArray[i]) - BadSquareRoot.sqrt(testArray[i]));
					return false;
				}
							
			}
							
			return true;
		}
		
		public static boolean testUgly(double[] testArray, double epsilon)
		{
			for (int i = 0; i < testArray.length; i++)
			{
				if (areWithinEpsilon(UglySquareRoot.sqrt(testArray[i]), Math.sqrt(testArray[i]), epsilon) == false)
				{
					System.out.print("UglySqrt - Not valid within: ");
					if (BadSquareRoot.sqrt(testArray[i]) > Math.sqrt(testArray[i])) 
					{
						System.out.print(UglySquareRoot.sqrt(testArray[i]) - Math.sqrt(testArray[i]));
					}
					else System.out.print(Math.sqrt(testArray[i]) - UglySquareRoot.sqrt(testArray[i]));
					return false;
				}
			
			}
							
			return true;
		}
		
		
		
		public static void main(String[] args)
		{
			double start = 1.0;
			double stop = 5.0;
			double inc = 0.1;
			double epsilon = 0.001;
			
			testGood(arrange(start,stop,inc), epsilon );
			testBad(arrange(start,stop,inc), epsilon );
			testUgly(arrange(start,stop,inc), epsilon );
			
		}
		
	}

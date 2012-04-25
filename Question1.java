public class Question1
{
	public static boolean inRange(int[] a, int b, int c)
	{		
		for ( int i = 0; i < a.length; i++ )
		{
			if ( a[i] < b || a[i] > c )
				return false;
		}
		
		return true;
	}
	
	public static int[] copyRange(int[] array, int digit1, int digit2)
	{
		int[] d = new int[array.length];
		
		for ( int i = 0; i < array.length; i++ )
		{
			if( i < digit1 || i > digit2 ) 
			{
				d[i] = -1;
			}
			else 
			{
				d[i] = array[i];
			}
		}
		
		for ( int i = 0; i< d.length; i++ ) 
		{
			System.out.print(d[i] + " ");
		}
		System.out.println();		
		return d;
	}
	
	public static int[] remove(int[] a, int b)
	{
		int cnt = 0;
		
		int[] d = new int[a.length];
		
		for ( int i = 0; i < a.length; i++ )
		{
			if (a[i] == b) 
			{
				cnt++; 
				a[i] = 0;
			}
			else 
			{
				d[i-cnt] = a[i];
			}
		}
		
		int[] fin = new int[d.length - cnt];
		
		for ( int j = 0; j < d.length-cnt; j++ )
		{	
			fin[j] = d[j];
			System.out.print(d[j] + " ");
		}
		System.out.println();
			
		return fin;
	}
	
	public static void main(String[] args)
	{
		boolean a = inRange(new int[] {1, 2, 3, 4, 5}, 1, 5);
		boolean b = inRange(new int[] {3, 6, 9}, 1, 5);
		boolean c = inRange(new int[] {3, 5, 4, 3}, 2, 6);
		boolean d = inRange(new int[] {1, 2, 3, 4, 5}, 2, 5);
		
		
		copyRange(new int[] {5, 4, 3, 2, 1}, 1, 3);
		copyRange(new int[] {5, 11, 3, 9}, 0, 1);
		copyRange(new int[] {3, 3, 3, 3, 3, 8}, 3, 5);		
		
		remove(new int[] {1, 2, 3, 4, 5}, 3);
		remove(new int[] {2, 2, 5, 8, 4, 4, 6, 4}, 4);
		remove(new int[] {7, 5, 3, 3, 5, 7}, 7 );
		remove(new int[] {1, 2, 3, 4, 5}, 6);
		
		System.out.println("A is: " + a);
		System.out.println("B is: " + b);
		System.out.println("C is: " + c);
		System.out.println("D is: " + d);
	}
	
}
			
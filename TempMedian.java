import java.util.Arrays;

public class TempMedian
{
	public static void main(String[] args)
	{
		int index = args.length;
		String [] a = new String[index];
		for(int k = 0; k<index; k++)
		{
			a[k] = args[k];
		}
		int num = Integer.parseInt(a[0]);
		int c = num;
		int [] b = new int[index];
		b[0] = c;
		for(int k = 1; k < a.length; k++)
		{
			if(a[k].equals("."))
			{
				b[k] = num;
			}
			if(a[k].equals("+"))
			{
				num++;
				b[k] = num;
			}
			if(a[k].equals("-"))
			{
				num--;
				b[k] = num;
			}
		}
		for(int i = 0; i<index; i++)
		{
			System.out.print(b[i] + " ");
		}
		System.out.println();
		Arrays.sort(b);
		for(int j = 0; j<index; j++)
		{
			System.out.print(b[j] + " ");
		}
		System.out.println();
		int med1 = b[(b.length)/2];
		int med2 = b[(b.length/2)-1];
		int med3 = b[b.length/2];
		if(b.length % 2 != 0)
		{
			System.out.println(med1/1.0);
		}
		else
		{
			System.out.println((med2+med3)/2.0);
		}
	}
}
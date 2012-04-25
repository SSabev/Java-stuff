import java.util.Arrays;

public class Mode
{
	public static void main(String[] args)
	{
		int [] dataset = new int[args.length];
		int [] count = new int[10];
		int [] count_sort = new int[10];
		for ( int i = 0; i < args.length; i++ )
		{
			dataset[i] = Integer.parseInt(args[i]);
			count[dataset[i]]++;
			count_sort[dataset[i]]++;
		}
		Arrays.sort(count_sort);
		int max = count_sort[9];
		int a = 0;
		for ( int j = 0; j < 10; j++)
		{
			if(count[j] == max)
			{
				a = j;
			}
			System.out.print("[" + j + "s: " + count[j] + "]");
			for(int l = 0; l < count[j]; l++)
			{
				System.out.print(". ");
			}
			System.out.println();
		}
		System.out.println("Mode: " + a);
	}
}
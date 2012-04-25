public class LopsidedNumberTriangle
{
	public static void main(String[] args)
	{
		for(int line_num = 1 ; line_num <= 9 ; line_num++ )
		{
			for (int char_num = 1; char_num <= line_num; char_num++)
			{
				System.out.print(line_num);
			}
			System.out.println();
		}
	}
}
import java.util.Scanner;
class  PerfectNumberPos
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Position : ");
		int pos = sc.nextInt();
		int count=0;
		for(i = 1; ; i++) 
		{
			int Sum=0;
			for(j = 1; j < i; j++)
			{
				if(i % j == 0) 
				{
					Sum = Sum + j;
				}
			}
			if (Sum == i) 
			{
				count++;
			}
			if (count==pos)
			{
				System.out.println(Sum);
				break;
			}
		}
	}
}

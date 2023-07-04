import java.util.Scanner;
class PerfectSquarePos
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter position :");
		int pos=sc.nextInt();
		int count=0;
		for(int i=1; ;i++)
		{
			int a=i;
			int sum=i;
			for(int j=0;j<=a;j++)
			{
				if(j*j==a)
				{
					count++;
				}
			}
			if (count==pos)
			{
				System.out.println(sum);
				break;
			}
		}
	}
}
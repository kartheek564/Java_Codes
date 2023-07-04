import java.util.Scanner;
class PrimeNumPos
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter position value : ");
		int pos=sc.nextInt();
		int i,j,count=0,sum=0;
		for (i=0; ;i++ )
		{
			for (j=2 ;j<i ;j++ )
			{
				if (i%j==0)
				{
					break;
				}
				else
				{
					sum=sum+i;
				}
			}
		if (i==j)
		{
			count++;
		}
		if (count==pos)
		{
			System.out.println(sum);
			break;
		}
		}
	}
}

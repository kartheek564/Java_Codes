import java.util.Scanner;
class SpyNumPos 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position ");
		int pos=sc.nextInt();
		int count=0;
		for (int i=1; ;i++ )
		{
				int sum=0,product=1;
				int a=i;
				while (a!=0)
				{
				int digit=a%10;
				sum=sum+digit;
				product=product*digit;
				a=a/10;
				}
			if (sum==product)
			{
				count++;	
			}
			if (count==pos)
			{
				System.out.println(i);
				break;
			}
		}
	}
}

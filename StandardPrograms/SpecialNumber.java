import java.util.Scanner;
class  SpecialNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int sum=0;
		int temp=n,count=0,count1=0;
		boolean status=false;
		while (n!=0)
		{
			int digit=n%10;
			if (digit==7)
			{
				count++;
				if (count==1)
				{
					status=true;
				}
			}
			sum=sum+digit;
			n=n/10;
		}
		if (sum==7||temp%7==0)
		{
			status=true;
		}
		if (status)
		{
			System.outr.println("Given number is  Special Number ");
		}
		else 
			System.out.println("Given number is not Special Number ");
	}
}

import java.util.Scanner;
class  StrongNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while (n!=0)
		{
			int digit=n%10;
			int fact=1;
			for (int i=1;i<=digit ;i++ )
			{
				fact*=i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if (temp==sum)
		{
			System.out.println(temp+" is a Strong number"); 
		}
		else
		{
			System.out.println(temp+" is not a Strong number"); 
		}
	}
}

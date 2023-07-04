import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int m=sc.nextInt();
		int sum=0;
		int temp=m;	
		for (int i=1;i<=m ;i++ )
			{
				int n=m*m;
				int temp1=n;
				System.out.println("Perfect square of "+m+" is :"+n);
				while(n!=0)
				{
					int digit=n%10;
					sum=sum+digit;
					n=n/10;
				}	
			System.out.println("The sum of perfect suqare of "+temp1+" is :"+sum);
			break;
			}
		if (temp==sum)
		{
			System.out.println(temp+" is a neon number");
		}
		else
			System.out.println(temp+" is not a neon number");
	}
}
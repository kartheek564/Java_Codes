import java.util.Scanner;
class  ArmstrongNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		int temp1=n;
		int count=0;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		while(temp!=0)
		{
			int digit=temp%10;
			int power=1;
			for (int i=1;i<=count ;i++ )
			{
				power*=digit;
			}
			sum=sum+power;
			temp=temp/10;
		}
		if (temp1==sum)
		{
			System.out.println(temp1+" is a ArmStrong number"); 
		}
		else
		{
			System.out.println(temp1+" is not a ArmStrong number"); 
		}
	}
}

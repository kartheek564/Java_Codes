//The number each digit factorial summetion is equal to the number is called strong number
import java.util.Scanner;
class  StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
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
		if (sum==temp)
		{
			System.out.println(temp+" is a Strong number");
		}
		else
			System.out.println(temp+" is a not Strong number");		
	}
}
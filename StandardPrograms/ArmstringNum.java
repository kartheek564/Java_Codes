//The power of summetion of each digit in the number by the count of the digits is equal to the number is known as Armstrong number
import java.util.Scanner;
class  ArmstringNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		int sum=0;
		int temp1=n;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		while (temp!=0)
		{
			int digit=temp%10;
			int power=1;
			for (int i=1;i<=count ;i++ )
			{
				
				power=power*digit;
			}
			sum=sum+power;
			temp=temp/10;
		}
		if (temp1==sum)
		{
			System.out.println(temp1+" is an armstrong number ");
		}
		else
			System.out.println(temp1+" is not an armstrong number ");
	}
}
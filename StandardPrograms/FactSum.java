import java.util.Scanner;
class FactSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n=sc.nextInt();
		int sum=0;
		int fact=1;
		for (int i=1;i<=n ;i++ )
		{
			fact=fact*i;
		}
		System.out.println("The factorial of given number "+n+" is : "+fact);
		while (fact!=0)
		{
			int digit=fact%10;
			sum=sum+digit;
			fact/=10;
		}
		System.out.println("The factorial sum is : "+sum);
	}
}

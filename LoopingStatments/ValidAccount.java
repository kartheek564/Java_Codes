import java.util.Scanner;
class ValidAccount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account number : ");
		long n=sc.nextLong();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
			if(count>=12&&count<=16)
			{
				System.out.println("Valid Account Number!!");
	
			}
			else
			{
				System.out.println("Invalid Account Number!!");
				
			}
	}
}
import java.util.Scanner;
class ValidOtp
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP number : ");
		int n=sc.nextInt();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
			if(count==4||count==6)
			{
				System.out.println("Valid OTP !!");
	
			}
			else
			{
				System.out.println("Invalid OTP !!");
				
			}
	}
}
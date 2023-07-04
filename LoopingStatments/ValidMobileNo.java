import java.util.Scanner;
class ValidMobileNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile number : ");
		long n=sc.nextLong();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
			if(count==10)
			{
				System.out.println("Valid mobile number!!");
	
			}
			else
			{
				System.out.println("Invalid mobile number!!");
				
			}
	}
}

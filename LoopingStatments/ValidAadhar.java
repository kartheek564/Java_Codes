import java.util.Scanner;
class ValidAadhar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Aadhar number : ");
		long n=sc.nextLong();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
			if(count==12)
			{
				System.out.println("Valid Aadhaar Number!!");
	
			}
			else
			{
				System.out.println("Invalid Aadhaar Number!!");
				
			}
	}
}
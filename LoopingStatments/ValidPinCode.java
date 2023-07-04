import java.util.Scanner;
class ValidPinCode 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pin number : ");
		int n=sc.nextInt();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
			if(count==6)
			{
				System.out.println("Valid Pin Code!!");
	
			}
			else
			{
				System.out.println("Invalid Pin Code!!");
				
			}
	}
}

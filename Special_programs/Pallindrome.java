import java.util.Scanner;
class Pallindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while (n!=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if (rev==temp)
		{
			System.out.println(temp+" is a pallindrome number");
		}
		else
			System.out.println(temp+" is not a pallindrome number");
	}
}

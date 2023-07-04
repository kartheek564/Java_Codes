import java.util.*;
class  OddSmallesttDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int small=9;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (small>digit&&digit%2==1)
			{
				small=digit;
			}
		}
		System.out.println("The odd smallest digit of the number is : "+small);
	}
}
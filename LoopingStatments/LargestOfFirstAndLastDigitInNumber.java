import java.util.*;
class  LargestOfFirstAndLastDigitInNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int temp=n;
		int first=0;
		int last=0;
		while (n!=0)
		{
			int digit=n%10;
			if (n==temp)
			{
				last=digit;
			}
			n=n/10;
			if (n==0)
			{
				first=digit;
			}
		}
			System.out.println(first);
			System.out.println(last);
			System.out.println(first>last ? "The largest of first and last digit in the number is : "+first : "The largest of first and last digit in the number is : "+last);
	}
}

import java.util.*;
class  SumEvenOddLargestEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int large=0;
		int large1=0;
		int sum;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (digit%2==0&&large<digit)
			{
					large=digit;
			}
			else if (digit%2==1&&large1<digit)
			{
					large1=digit;
			}
		}
		System.out.println("The even largest digit of the number is : "+large);
		System.out.println("The odd largest digit of the number is : "+large1);
		sum=large+large1;
		System.out.print("The sum of even largest and odd largest is :"+sum);
		System.out.println();
		if (sum%2==0)
		{
			System.out.println("Summetion of even largest and odd largest is Even");
		}
		else
			System.out.println("Summetion of even largest and odd largest is Odd");
	}
}
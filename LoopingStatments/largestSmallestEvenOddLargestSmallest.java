import java.util.*;
class  largestSmallestEvenOddLargestSmallest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int smallest=9;
		int largest=0;
		int small=9;
		int large=0;
		int temp=n;
		int temp1=n;
		int l=large;
		int s=small;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (largest<digit)
			{
					largest=digit;
			}
			else
			{
				smallest=digit;
			}
		}
		while (temp!=0)
		{
			int digit=temp%10;
				temp=temp/10;
				if (digit%2==0)
				{
					if (large<digit)
					{
						large=digit;
					}
				}
				else
				{
					if (small>digit)
					{
						small=digit;
					}
				}
		}
		while (temp1!=0)
		{
			int digit=temp1%10;
				temp1=temp1/10;
				if(digit%2==1)
				{
					if (l<digit)
					{
						l=digit;
					}
				}
				else
				{
					if (s>digit)
					{
						s=digit;
					}
				}
		}
		System.out.println("The Largest digit of given number is : "+largest);
		System.out.println("The smallest digit of given number is : "+smallest);
		System.out.println("The Largest Even digit of given number is : "+large);
		System.out.println("The Smallest odd digit of given number is : "+small);
		System.out.println("The odd largest of given number is : "+l);
		System.out.println("The even smallest of given number is : "+s);
	}
}

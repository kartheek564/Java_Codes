import java.util.Scanner;
class  SumOfEvenProductOfOddDigitsEqualOrnot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		int product=1;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (digit%2==0)
			{
				sum=sum+digit;
				
			}
			else
			{
				product=product*digit;
				
			}
		}
			System.out.println(sum);
			System.out.println(product);
		if (sum==product)
		{
			System.out.println("sum of even digits and product of odd digits in the number is equal!!");
		}
		else
			System.out.println("summ of even digits and product of odd digits in the number is not equal!!");
	}
}
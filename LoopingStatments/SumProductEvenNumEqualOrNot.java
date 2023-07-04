import java.util.Scanner;
class  SumProductEvenNumEqualOrNot
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
				product=product*digit;
			}
				
		}
		if (sum==product)
				{
					System.out.println("sum and product of even digits in the number"+temp+" is equal!!");
					
				}
				else
				{
					System.out.println("sum and product of even digits in the number "+temp+" is not equal!!");
					
			}		
	}
}

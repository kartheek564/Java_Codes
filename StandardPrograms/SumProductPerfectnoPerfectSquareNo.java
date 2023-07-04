import java.util.Scanner;
class  SumProductPerfectnoPerfectSquareNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int sum1=0;
		boolean status=false;
		int product=1;
		while (n!=0)
		{
			int digit=n%10;
			sum=sum+digit;
			product=product*digit;
			n=n/10;
		}
		System.out.println("The sum of the given number "+temp+" is "+sum);
		System.out.println("The product of the given number "+temp+" is "+product);
		if (sum==product)
		{
			System.out.println("The Sum and product of the given number is equal ");
			for (int i=1;i<sum ;i++ )
			{
				if (sum%i==0)
				{
					sum1=sum1+i;
				}
			}
			if (sum1==sum)
			{
				System.out.println(sum1+" is Perfect Number");
			}
			else 
				System.out.println(sum1+" Not a Perfect Number");
		}
		else
		{
			System.out.println("The Sum and product of the given number is not equal ");
			for (int i=1;i<(product/2) ;i++ )
			{
				if (i*i==product)
				{
					status=true;
				}
			}
			if (status)
			{
				System.out.println(product+" is a perfect square number ");
			}
			else
				System.out.println(product+" is not a perfect square number ");
		}
	}
}

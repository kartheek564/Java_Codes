import java.util.Scanner;
class SumPrimeArmStrongpalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n=sc.nextInt();
		int n1=0,n2=1,n3=0,sum=0;
		int temp=sum;
		int count=0;
		int sum1=0,sum2=0;
		int rev=0;
		for (int i=3;i<=n ;i++ )
		{
			n3=n1+n2
;			if (n3>1)
			{
				boolean isPrime=true;
				for (int j=2;j<n3 ;j++ )
				{
					if (n3%j==0)
					{
						isPrime=false;
						break;
					}
				}
				if (isPrime)
				{
					sum=sum+n3;
				}
			}
			n1=n2;
			n2=n3;
		}
		System.out.println("The sum of Prime Fibonacci numbers is : "+sum+" ");
		int temp1=sum;
		int temp2=sum;
		while (sum!=0)
		{
			count++;
			sum=sum/10;
		}
		while (temp!=0)
		{
			int digit=sum%10;
			int power=1;
			for (int i=1;i<=count ;i++ )
			{
				power=power*digit;
			}
			sum1=sum1+power;
			sum=sum/10;
		}
		if (temp1==sum1)
		{
			System.out.println(temp1+" is an armstrong number ");
			while (temp1!=0)
		{
			int digit=temp1%10;
			int fact=1;
			for (int i=1;i<=digit ;i++ )
			{
				fact*=i;
			}
			sum2=sum2+fact;
			temp1=temp1/10;
		}
		if (sum==temp)
		{
			System.out.println(temp1+" is a Strong number");
		}
		else
			{
			System.out.println(temp1+" is a not Strong number");
			}

		}
		else
		{
			System.out.println(temp1+" is not an armstrong number ");
			while (temp1!=0)
			{
				int digit=temp1%10;
				rev=rev*10+digit;
				temp1=temp1/10;
			}
			if (temp1==rev)
			{
				System.out.println(temp2+" is a pallindrome number ");
			}
			else
				System.out.println(temp2+" is not a pallindrome number ");
		}
	}
}

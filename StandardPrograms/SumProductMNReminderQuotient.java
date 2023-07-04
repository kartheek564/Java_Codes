import java.util.Scanner;
class  SumProductMNReminderQuotient
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m=sc.nextInt();
		System.out.println("Enter n value : ");
		int n=sc.nextInt();
		int count=0;
		int sum=0,product=1;
		int temp=sum;
		for (int i=m;i<=n ;i++ )
		{
			sum=sum+i;
			product=product*i;
		}
		System.out.println("The sum of given numbers "+m+" and "+n+ " is : "+sum);
		System.out.println("The product of given numbers "+m+" and "+n+ " is : "+product);
		while (sum>=product)
		{
			sum=sum-product;
			count++;
		}
		System.out.println("The reminder of "+sum+" is divisible by " +product+" is "+sum);
		System.out.println("The quotioent of "+sum+" is divisible by " +product+" is "+count);
	}
}

import java.util.Scanner;
class  SumProdMNSumEO
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		for (int i=m;i<=n ;i++ )
		{
			sum=sum+i;
			product=product*i;
		}
		System.out.println("The Summetion of Natural numbres between "+m+" and "+n+" is:"+sum);
		System.out.println("The Product of Natural numbres between "+m+" and "+n+" is:"+product);
		if (sum%2==0)
		{
			System.out.println("Summetion is Even");
		}
		else
			System.out.println("Summetion is not even");
	}
}

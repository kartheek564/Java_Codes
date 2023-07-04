import java.util.Scanner;
class  SumProductMN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value: ");
		int m=sc.nextInt();
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		for (int i=m;i<=n ;i++ )
		{
				sum=sum+i;
				product=product*i;
				System.out.print(i);	
		}
		//System.out.println();
		//System.out.print(count+" is the count " );
	}
}

import java.util.Scanner;
class ProductSumOfFib 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		int n1=0;
		int n2=1;
		int n3=0;
		for(int i=0;i<n;i++	)
		{
			sum=sum+n1;
			product=product*n1;
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}

		System.out.println(sum);
		System.out.println(product);
	}
}

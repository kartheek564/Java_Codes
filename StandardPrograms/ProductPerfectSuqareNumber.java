import java.util.Scanner;
class ProductPerfectSuqareNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : " );
		int n=sc.nextInt();
		int product=1;
		boolean status=false;
		while (n!=0)
		{
			int digit=n%10;
			product=product*digit;
			n=n/10;
		}
		System.out.println(product);
		System.out.println("  ");
		for (int i=1;i<(product/2)+1 ;i++ )
		{
			if (i*i == product)
			{
				status=true;
				break;
			}
		}
		if (status)
		{
			System.out.println(product+" is a perfect square number!");
		}
		else
			System.out.println(product+" is not a perfect square number!");
	}
}

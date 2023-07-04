import java.util.Scanner;
class  SumEvenOddMN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int Even=0;
		int Odd=0;
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==0)
			{
				Even=Even+i;
			}
			else 
			{
				Odd=Odd+i;
			}
		}
		if (Even==Odd)
		{
			System.out.println("Summetion of Even and Odd is Equal");
		}
		else
		{
			System.out.println("Summetion of Even and Odd is not Equal");
		}
	}
}

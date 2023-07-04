import java.util.Scanner;
class FibSeriesRange
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
			if (n==0)
			{
				System.out.print(n1+" ");
			}
			else
			{
			System.out.print(n1+" "+n2);
			for (int i=1;i<=n ;i++ )
			{
				n3=n1+n2;
				if (n3<=n)
			{
				System.out.print(" "+n3+" ");
			}
			n1=n2;
			n2=n3;
			}
			}
	}
}

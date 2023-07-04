import java.util.Scanner;
class FibonacciByReadingPos 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Position : ");
		int pos=sc.nextInt();
		int n1=0,n2=1,n3=0;
		int count=2;
		if (pos==1)
		{
			System.out.println(n1);
		}
		else if (pos==2)
		{
			System.out.println(n2);
		}
		else
		{
			for (int i=1; ;i++ )
			{
				n3=n1+n2;
				count++;
				if (count==pos)
				{
					System.out.println(n3);
					break;
				}
				n1=n2;
				n2=n3;
			}
		}
	}
}

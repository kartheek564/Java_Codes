import java.util.Scanner;
class CountFabNotDiv37 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
		int count=0;
		for (int i=1;i<=n ;i++ )
		{
			n3=n2+n2;
			if (n3%3==1&&n3%7==1)
			{
				count++;
				System.out.println(n3+" ");
			}
			n1=n2;
			n2=n3;
		}
		System.out.println(count);
	}
}

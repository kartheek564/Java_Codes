import java.util.Scanner;
class PerfectSquare 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value :");
		int n=sc.nextInt();
		int a,sun=0;
		boolean status=false;
		for(int i=1;i<=n;i++)
		{
				if(i*i==n)
				{
					status=true;
					break;
				}
		}
		if (status)
		{
			System.out.println(n+" is a perfect square ");
		}
		else
			System.out.println(n+" is a not perfect square ");
	}
}
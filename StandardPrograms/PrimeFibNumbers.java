import java.util.Scanner;
class PrimeFibNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n=sc.nextInt();
		int n1=0,n2=1,n3=0;
		for (int i=3;i<n ;i++ )
		{
			n3=n1+n2;
			if (n3>1)
			{
			boolean isprime=true;
			for (int j=2;j<n3 ;j++ )
			{
				if (n3%j==0)
				{
					isprime=false;
					break;
				}
			}
			if (isprime)
				{
					System.out.print(n3+" ");
				}
			}
			n1=n2;
			n2=n3;
			
		}
		System.out.println();
	}
}

import java.util.Scanner;
class SumOddPrimeFib 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int n1=0,n2=1,n3=0,sum=1;
		for (int i=3;i<=n ;i++ )
		{
			n3=n1+n2;
			if (n3>1)
			{
				if(n3%2==1)
				{
					boolean isprime=true;
					for (int j=2;j<n3 ;j++ )
					{
						if (n3%j==0)
						 {
							sum=sum+n3+1;
							break;
						}
					}
				}
			}
			n1=n2;
			n2=n3;
		}
		System.out.print(sum+" ");
	}
}

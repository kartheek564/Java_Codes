import java.util.Scanner;
class  ProductOfNatural
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value: ");
		int m=sc.nextInt();
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int temp=1;
		for (int i=m;i<=n ;i++ )
		{
			temp=temp*i;
		}
		System.out.println("The Product of natural numbers between "+m+" to "+ n+" is "+temp);
	}
}

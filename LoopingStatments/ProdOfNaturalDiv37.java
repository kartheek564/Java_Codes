import java.util.Scanner;
class  ProdOfNaturalDiv37
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
			if(i%3==0&&i%7==0)
				{
				temp=temp*i;
				}
		}
		System.out.println("The product of Natural numbers between "+m+" to "+ n+" is "+temp);
	}
}

import java.util.Scanner;
class SumTable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(sum+" * "+i+" = "+(sum*i));
		}
	}
}

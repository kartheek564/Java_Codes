import java.util.Scanner;
class  MagicNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		while (n>9)
		{
			int sum=0;
			while (n!=0)
			{
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			n=sum;
		}
		if (n==1)
		{
			System.out.println(n+" is a magic number");
		}
		else
			System.out.println(n+" is not a  magic number");
	}
}

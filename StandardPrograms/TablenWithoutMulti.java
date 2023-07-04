import java.util.Scanner;
class TablenWithoutMulti
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1;i<=10 ;i++ )
		{
			sum=sum+n;
			System.out.println(n+" * "+i+" = "+(sum));
		}
	}
}

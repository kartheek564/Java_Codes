import java.util.Scanner;
class  xpowern
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x value : ");
		int x=sc.nextInt();
		System.out.print("Enter n value : ");
		int n=sc.nextInt();
		int power=1;
		for (int i=1;i<=n ;i++ )
		{
			power=power*x;
		}
		System.out.println("The power of "+x+" by "+n +" is "+power);
	}
}

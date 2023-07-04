import java.util.Scanner;
class  OddDiv35MNDesc
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value: ");
		int m=sc.nextInt();
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int count=0;
		for (int i=n;i>=m ;i-- )
		{
			if (i%2==1&&i%3==0&&i%5==0)
			{
				System.out.print(i+" ");
				count++;	
			}	
		}
		System.out.println();
		System.out.print(count+" is the count " );
	}
}

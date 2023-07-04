import java.util.Scanner;
class  SummeOfNaturalEven
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value: ");
		int m=sc.nextInt();
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int temp=0;
		for (int i=m;i<=n ;i++ )
		{
			if(i%2==0)
				{
				temp=temp+i;
				}
		}
		System.out.println("The summetation of Even numbers between "+m+" to "+ n+" is "+temp);
	}
}

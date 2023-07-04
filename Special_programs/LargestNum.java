import java.util.Scanner;
class  LargestNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int largest=0;
		while (n!=0)
		{
			int digit=n%10;
			if (largest<digit)
			{
				largest=digit;
			}
			n=n/10;
		}
		System.out.println("The largest digit if given number of "+temp+ " is "+largest);
	}
}
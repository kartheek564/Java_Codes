import java.util.Scanner;
class xpowernLargestSmallest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int largest=0;
		int smallest=9;
		int m=n;
		while (n!=0)
		{
			int digit=n%10;
			if (largest<digit)
			{
				largest=digit;
			}
			else
			{
				smallest=digit;	
			}
			n=n/10;
		}
		System.out.println("Lagest number of given number "+m+" is "+largest);
		System.out.println("Smallest number of given number "+m+" is "+smallest);
		int power=1;
		for (int i=1;i<=smallest ;i++ )
		{
			power=power*largest;
		}
		System.out.println("The power of "+largest+" by "+smallest +" is "+power);
	}
}
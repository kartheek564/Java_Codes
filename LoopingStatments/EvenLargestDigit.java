import java.util.*;
class  EvenLargestDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int largest=0;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			if (largest<digit&&digit%2==0)
			{
					largest=digit;
			}
		}
		System.out.println("The even largest digit of the number is : "+largest);
	}
}

import java.util.*;
class  FirstHalfNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		while (n!=0)
		{
				count++;
				n=n/10;
		}
		int a=0;
		while (temp!=0)
		{
			int digit=temp%10;
			a++;
			if (a>(count/2))
			{
			System.out.print(digit+" ");
			}
			temp=temp/10;
		}
	}
}

import java.util.*;
class  DigitsNotDiv3Greater3NotEvenNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		while (n!=0)
		{
			int digit=n%10;
			if (digit>3&&digit%2==1&&digit%3==1)
			{
					count++;
			}
			n=n/10;
		}
		System.out.println(count);
		//System.out.println(digit);
	}
}

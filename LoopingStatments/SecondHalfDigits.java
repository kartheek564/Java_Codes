import java.util.*;
class  SecondHalfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		int a=0;
		while (temp!=0)
		{
			int digit = temp%10;
			a++;
			if (a<=(count/2))
			{
				System.out.print(digit+" ");
			}
			else {
				break;
			}
			temp=temp/10;
		}

	}

}

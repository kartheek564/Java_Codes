import java.util.Scanner;
class CountEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int count=0;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println("The count of given number digit  " + count);
		if (count%2==0)
		{
			System.out.println(count+" is even");
		}
		else
			System.out.println(count+" is odd");
	}
}

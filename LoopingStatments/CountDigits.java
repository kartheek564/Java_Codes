import java.util.Scanner;
class CountDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println("The number of digits in "+temp+" is "+count);
	}
}

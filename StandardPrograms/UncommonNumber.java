import java.util.Scanner;
class  UncommonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		if (n%2==1&&n%3==1&&n%5==1&&n%7==1)
		{
			System.out.println("Uncommon number");
		}
		else
			System.out.println("common number");
	}
}
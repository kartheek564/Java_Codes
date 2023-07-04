import java.util.Scanner;
class  SpecialEleven
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		int sum=0;
		if (n%11==0)
		{
			System.out.println("Specail eleven");
		}
		else
			System.out.println("not a Specail eleven");
	}
}

import java.util.Scanner;
class NumUnitsVertical 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int i=1;
		while(n!=0)
		{
			int digit=n%10;
			n=n/10;
			System.out.println(digit+"-->"+i);
			i=i*10;
		}
	}
}

import java.util.Scanner;
class  ScanChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char c=sc.next().charAt(0);
		System.out.println("Given Character is : " +c);
	}
}

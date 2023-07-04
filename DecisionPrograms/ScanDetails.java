import java.util.Scanner;
class ScanDetails 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Details..!");
		System.out.println("======================");
		System.out.print("Enter College name	: ");
		String college=sc.nextLine();
		System.out.print("Enter your name		: ");
		String name=sc.nextLine();
		System.out.print("Enter Address		: ");
		String Address=sc.nextLine();
		System.out.print("Enter Mobile number	: ");
		long Mno=sc.nextLong();
		System.out.print("Enter Mail Address	: ");
		String mail=sc.next();
		System.out.print("Enter age		: ");
		int age=sc.nextInt();
		System.out.print("Enter percentage	: ");
		double per=sc.nextDouble();
		System.out.print("Enter Grade		: ");
		char grade=sc.next().charAt(0);
		System.out.println("======================");
		System.out.println("Given College Name	: "+college);
		System.out.println("Given Name		: "+name);
		System.out.println("Given Address		: "+Address);
		System.out.println("Given Mobile Number	: "+Mno);
		System.out.println("Given Mail Address	: "+mail);
		System.out.println("Given Age		: "+age);
		System.out.println("Given Percentage	: "+per);
		System.out.println("Given Grade		: "+grade);
		
	}
}

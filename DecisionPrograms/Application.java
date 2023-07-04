//A program To design govenrment application form name,dob,fathers name,aadaar num,age,address,m num,email,gender,qualification
import java.util.Scanner;
class Application
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("=====Fill The Application====");
		System.out.println("Enter Your Name	:");
		String name=sc.nextLine();
		System.out.println("Enter Date of Birth	:");
		String dob=sc.nextLine();
		System.out.println("Enter Father Name	:");
		String Fname=sc.nextLine();
		System.out.println("Enter Aadaar Number	:");
		long mobile=sc.nextLong();
		System.out.println("Enter age	:");
		int age=sc.nextInt();
		System.out.println("Enter Address	:");
		String add=sc.next();
		System.out.println("Enter Mobile Number	:");
		long num=sc.nextLong();
		System.out.println("Enter Email	:");
		String mail=sc.next();
		System.out.println("Enter Gender	:");
		char gender=sc.next().charAt(0);
		System.out.println("Enter Qualification	:");
		String qualification=sc.next();
		System.out.println("=======================");
		System.out.println("press 1 for Submit Application \nPress 2 for Cancellation");
		int a=sc.nextInt();
		if(a==1)
		{
			System.out.println("=======================");
			System.out.println("Application Submitted Successfully..!!");
		}
			else
		{
			System.out.println("=======================");
			System.out.println("Application Cancelled..!!");
		}
	}
}

import java.util.*;
class Swapping
{
	public static void main(String[] args)
	{
		int a,b,c;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter two values");

		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

        c=a;
		a=b;
		b=c;

		System.out.println("After Swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}

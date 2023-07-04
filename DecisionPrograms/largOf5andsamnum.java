/* A program to print largest and smallest of five numbers and print summetation of largest and smallest numbers*/
class largOf5andsamnum
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=15;
		int c=5;
		int d=5;
		int e=0;
		int f=0;
		System.out.println(a<b&&a<c&&a<d ? "Smallest is " +(e=a) : b<c&&b<d ? "Smallest is "+(e=b) : c<d ?  "Smallest is" +(e=c):  "Smallest is " +(e=d));
		System.out.println(a>b&&a>c&&a>d ? "Largest is " +(f=a) : b>c&&b>d ? " Largest is "+(f=b) : c>d ?  "Largest is " +(f=c): "Largest is " +(f=d));
		System.out.println("Summetation of Largest and Smallest numbers is : " +(e+f));
	}
}

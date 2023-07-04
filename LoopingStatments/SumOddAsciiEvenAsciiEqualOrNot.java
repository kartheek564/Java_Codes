//import java.util.Scanner;
class  SumOddAsciiEvenAsciiEqualOrNot
{
	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		int even=0;
		int	odd=0;
		for (char c='a';c<='z' ;c++)
		{
			if (c%2==0)
			{
				//System.out.println((int)c);
				even=even+c;
			}
			else
			{
				//System.out.println((int)c);
				odd=odd+c;
			}
		}
		if (even==odd)
		{
			System.out.println("summetion of odd ascii alphabets and even ascii alphabets is equal");
		}
		else
			System.out.println("summetion of odd ascii alphabets and even ascii alphabets is not equal");
	}
}
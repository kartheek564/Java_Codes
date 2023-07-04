//import java.util.Scanner;
class  OddAsciiSumLowerCase
{
	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		int sum=0;
		for (char c='a';c<='z' ;c++)
		{
			if (c%2==1)
			{
				System.out.println((int)c);
				sum=sum+c;
			}
		}
	}
}
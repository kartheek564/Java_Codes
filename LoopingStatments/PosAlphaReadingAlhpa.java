import java.util.Scanner;
class  PosAlphaReadingAlhpa
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabet: ");
		char alpha=sc.next().charAt(0);
		if (alpha>='a'&&alpha<='z')
		{
			int count=0;
			for (char ch='a';ch<='z' ;ch++ )
			{
				count++;
				if (ch==alpha)
				{
					System.out.println(count);
					break;
				}
			}
		}
		else
			System.out.println("Invalid Position!!");
	}
}

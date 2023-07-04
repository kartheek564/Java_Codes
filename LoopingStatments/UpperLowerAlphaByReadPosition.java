import java.util.Scanner;
class UpperLowerAlphaByReadPosition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Position:");
		int pos=sc.nextInt();
		if (pos>0&&pos<=26)
		{
			int count=0;
			for (char ch='a';ch<='z' ;ch++ )
			{
				count++;
				if(count==pos)
				{
					System.out.print(ch+" -->  ");
					break;
				}
			}
			int count1=0;
			for (char ch='A';ch<='Z' ;ch++ )
			{
				count1++;
				if(count1==pos)
				{
					System.out.println(ch);
					break;
				}
			}
		}
		else
			System.out.println("Invalid Position.!!");
	}
}

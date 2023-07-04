import java.util.Scanner;
class AlphabetByReadingPosition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter position :");
		int pos=sc.nextInt();
		if (pos>0&&pos<=26)
		{
			int count=0;
			for (char ch='a';ch<='z' ;ch++ )
			{
				count++;
				if(count==pos)
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

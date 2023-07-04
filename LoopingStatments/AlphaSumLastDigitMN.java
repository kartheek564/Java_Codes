import java.util.Scanner;
class AlphaSumLastDigitMN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		if (m>0&&m<=26)
		{
		int sum=0;
		for (int i=m;i<=n ;i++ )
		{
			sum=sum+i;
		}
			int pos=sum%10;
			if (pos>0&&pos<=26)
			{
				int count=0;
				for (char ch='a';ch<='z' ;ch++ )
				{
					count++;
					if (count==pos)
					{
						System.out.println(ch);
						break;
					}
				}
			}
		}
			else
				System.out.println("Invalid Position!!");
		}
	}


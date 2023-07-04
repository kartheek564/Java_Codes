/* Second biggest of 5 numbers*/
class  Sbof5num
{
	public static void main(String[] args) 
	{
		int a=1,b=4,c=3,d=2,e=5;
		if(a>b&&a>c&&a>d&&a>e)
		{
			if(b>c&&b>d&&b>e)
			{
			System.out.println(b+" is second biggest");
			}
			else if(c>d&&c>e)
			{
			System.out.println(c+" is second biggest");
			}
			else if(d>e)
			{
			System.out.println(d+" is second biggest");
			}
			else
			{
			System.out.println(e+" is second biggest");
			}
		}
		else if(b>a&&b>c&&b>d&&b>e)
		{
			if(c>d&&c>e)
			{
			System.out.println(c+" is second biggest");
			}
			else if(d>e)
			{
			System.out.println(d+" is second biggest");
			}
			else
			{
			System.out.println(e+" is second biggest");
			}
		}
		else if(c>d&&c>e)
		{
			if(d>e)
			{
			System.out.println(d+" is second biggest");
			}
		}

		else
		{
			System.out.println(e+" is second biggest");
		}
	}
}

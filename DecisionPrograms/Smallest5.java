class Smallest5
{
	public static void main(String[] args) 
	{
		int a=40;
		int b=65;
		int c=10;
		int d=1000;
		int e=50;
		if(a<b&&a<c&&a<d&&a<e)
		{
		System.out.println(a+" is smallest");
		}
		else if(b<c&&b<d&&b<e)
		{
			System.out.println(b+" is smallest");
		}
		else if(c<d&&c<e)
		{
			System.out.println(c+"is smallest");
		}
		else if(d<e)
		{
			System.out.println(d+" is smallest");
		}
		else
		{
			System.out.println(e+" is smallest");
		}
	}
}

class LargestOf5
{
	public static void main(String[] args) 
	{
		int a=500,b=10,c=3,d=100,e=50;
		System.out.println(a>b&&a>c&&a>d&&a>e ? a+" is Largest " : b>c&&b>d&&b>e ? b+" is Largest" : c>d&&c>e ? c + " is Largest" : d>e? d+" is Largest" : e+" is Largest");
	}
}

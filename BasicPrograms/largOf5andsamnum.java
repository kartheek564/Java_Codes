class largOf5andsamnum
{
	public static void main(String[] args) 
	{
		int a=0,b=10,c=30,d=10,e=50;
		System.out.println(a>b&&a>c&&a>d&&a>e ? a+" is Largest " : b>c&&b>d&&b>e ? b+" is Largest" : c>d&&c>e ? c + " is Largest" : d>e? d+" is Largest" : e+" is Largest");
		System.out.println(a<b&&a<c&&a<d&&a<e ? a+" is Smallest " : b<c&&b<d&&b<e ? b+" is Smallest" : c<d&&c<e ? c + " is Smallest" : d<e? d+" is Smallest" : e+" is Largest");
	}
}

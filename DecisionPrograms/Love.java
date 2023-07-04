class Love 
{
	public static void main(String[] args) 
	{
		int a=1,b=10,c=30,d=2,e=7;
		String t;
		t=(a>b&&a>c&&a>d&&a>e ? a+" is Largest "+(a=0) : b>c&&b>d&&b>e ? b+" is Largest"+(b=0) : c>d&&c>e ? c + " is Largest" +(c=0): d>e? d+" is Largest"+(d=0) : e+" is Largest"+(e=0));
	System.out.println(a>b&&a>c&&a>d&&a>e ? a+" is second Largest " : b>c&&b>d&&b>e ? b+" is second  Largest" : c>d&&c>e ? c + " is second  Largest" : d>e? d+" is second  Largest" : e+" is second  Largest");
	
	}
}

class  Smallof5numbs
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=3;
		int d=10;
		int e=50;
		System.out.println(a<b&&a<c&&a<d&&a<e ? "a  is smaller" : b<c&&b<d&&b<e ? "b is smaller" : c<d&&c<e ?  "c is smaller" : d<e ? "d is smaller" : "e is smaller");
		System.out.println(a>b&&a>c&&a>d&&a>e ? + (c+d+e) : b>c&&b>d&&b>e ? + (a+b+c) : c>d&&c>e ? + (b+c+d) : d>e ? + (a*b) : (d*e));

	}
}

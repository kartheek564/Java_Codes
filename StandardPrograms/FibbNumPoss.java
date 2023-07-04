class FibbNumPoss 
{
	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3=0;
		for (int i=1;i<=100 ;i++ )
		{
			n3=n1+n2;
			if (n3>10&&n3<=100)
			{
				System.out.println(n3);
			}
		n1=n2;
		n2=n3;
		}
	}
}

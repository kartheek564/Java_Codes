class  Div579
{
	public static void main(String[] args) 
	{
		int h=3000;
		while (h>=100)
		{
			if ((h%5==0)&&(h%7==0)&&(h%9==0))
			{
				System.out.println(h);
			}
			h--;
		}
		
	}
}

class Day 
{
	public static void main(String[] args) 
	{
		int a=2;
		if(a>=0&&a<=4||a>=20&&a<24)
		{
		System.out.println(a+" is at night");
		}
		else if(a>4&&a<=12)
		{
			System.out.println(a+ " is at morning");
		}
		else if(a>12&&a<16)
		{
			System.out.println(a+" is at afternoon");
		}
		else if(a>=16&a<20)
		{
			System.out.println(a+" is at Evening");
		}
		else
		{
			System.out.println("Invalid time");
	}
	}
}

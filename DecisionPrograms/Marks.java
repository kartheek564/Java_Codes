class Marks 
{
	public static void main(String[] args) 
	{
		int m=85;
		if(m>=0&&m<35)
		{
		System.out.println("Student is Failed");
	}
		else if(m>35&&m<=50)
		{
		System.out.println("Student is below average");
		}
		else if(m>50&&m<=70)
		{
			System.out.println("Student is average");
		}
		else if(m>70&&m<=80)
		{
			System.out.println("Student is good");
		}
		else if(m>80&&m<=90)
		{
			System.out.println("Student is Excellent");
		}
		else if(m>90&&m<=100)
		{
			System.out.println("Student is Outstanding");
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}
}

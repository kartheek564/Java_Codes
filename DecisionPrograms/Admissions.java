class Admissions 
{
	public static void main(String[] args) 
	{
		int m=9;
		if(m>=80&&m<=100)
		{
		System.out.println("A section");
		}
		else if(m>=70&&m<80)
		{
			System.out.println("B section");
		}
		else if(m>=50&&m<70)
		{
			System.out.println("C section");
		}
		else if(m>=35&&m<50)
		{
			System.out.println("D section");
		}
		else if(m>=0&&m<35)
		{
			System.out.println("F section");
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}
}

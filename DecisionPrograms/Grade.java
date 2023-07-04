class Grade 
{
	public static void main(String[] args) 
	{
		int g=-10;
		if(g>=0&&g<=100)
		{
			if(g>=0&&g<35)
			{
				System.out.println("Student got Failed");
			}
			else if(g>=35&&g<55)
			{
				System.out.println("Student got E Grade");
			}
			else if(g>=55&&g<70)
			{
				System.out.println("Student got D grade");
			}
			else if(g>=70&&g<80)
			{
				System.out.println("Student got C grade");
			}
			else if(g>=80&&g<90)
			{
				System.out.println("Student got B grade");
			}
			else
			{
				System.out.println("Student got A grade");
			}
		}
		else 
		{
			System.out.println("Invalid marks entered");
		}
	}
}

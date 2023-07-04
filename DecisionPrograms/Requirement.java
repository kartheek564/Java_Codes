/* A program to check person is eligible to get requirment or not */
class Requirement 
{
	public static void main(String[] args) 
	{
		int p=70;
		String s="is";
		int y=2020;
		if(p>=60&&p<=100 &&(y>=2019&&y<=2021))
		{
			if(s=="cse"||s=="is"||s=="it"||s=="ece")
			{
				System.out.println("Student is eligible for job");
			}
			else
			{
				System.out.println("Student is not eligible for job");
			}
		}
		else
		{
			System.out.println("Student is not eligible for job");
		}
	}
}

/* a program to check if a year is leap year or not if a year is divisible by four then it is a leap year if the centuary yr like 2000 1900, 2100 then it must be dividible by 400*/
class LeapYear 
{
	public static void main(String[] args) 
	{
		int a=1700;
		if(a%4==0)
		{
			System.out.print(a+ " is a leap year ");
			if(a%400==0)
			{
				System.out.println(a+ " is a divisible by 400 ");
			}
			}
			else 
			{
			System.out.println(a+ " it is not a leap year ");
			}
		}
		
	}

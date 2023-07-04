/*
a program to check if a year is leap year or not if a year is divisible by four then it is a leap year if the centuary yr like 2000 1900, 2100 then it must be dividible by 400*/
class LeapYear 
{
	public static void main(String[] args) 
	{
		int a=35;
		if(a%2==0)
		{
			System.out.print("Given number is Even ");
			if(a%5==0)
			{
				System.out.println(a+ " and divisible by 5 ");
			}
			else
			{
				System.out.println(a+ " and not divisible by 5 ");
			}
		}
		else
		{
			System.out.print(a+ " is odd number ");
			if(a%7==0)
			{
				System.out.println(a+" and divdisible by 7 ");
			}
			else
			{
				System.out.println(a+" and  not ivdisible by 7 ");
			}
		}
	}
}

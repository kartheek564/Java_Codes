/*A program to check weather givrn value is divisible by 3,7 or not
	if it divisible by convent the value into character
	if it is not print the next 10th number*/
class  Div37
{
	public static void main(String[] args) 
	{
		int a=42;
		if(a%3==0&&a%7==0)
		{
		System.out.println(a+" is divisible by 3 and 7---the character of "+a +" is "+(char)(a));
		}
		else
		{
			System.out.println((a+10)+" is the next 10th number of " +a);
		}
	}
}

/*A program to check a given value is alphabet or digit or special character if it 
is alphabet print both upper case and lower case  if it is digit check the ascii value last digit is even or odd if it
special character print the next character ascii value*/
class  Asciivalue
{
	public static void main(String[] args) 
	{
		char val='!';
		if(val>='a'&&val<='z' || val>='A'&&val<='Z')
		{
			if(val>='A'&&val<='Z')
			{
				System.out.println(val+" Lower case is "+((char)(val+32)));
			}
			else
			{
				System.out.println(val+" Upper case is "+((char)(val-32)));
			}
		}
		else if (val>='0'&&val<='9')
		{
			if(val%2==0)
			{
			System.out.println("Last digit of ascii value Even");
			}
			else
			{
				System.out.println("Last digit of ascii value Odd");
			}

		}
			else
		{
			System.out.println((int)(++val));
		} 

	}
}

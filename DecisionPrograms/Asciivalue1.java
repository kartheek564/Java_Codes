/*A program to check a given value is alphabet or digit or special character if it 
is alphabet print both upper case and lower case  if it is digit check the ascii value last digit is even or odd if it
special character print the next character ascii value*/

class Asciivalue1 
{
	public static void main(String[] args) 
	{
		char val='6';
		System.out.println(val>='a'&&val<='z' || val>='A'&&val<='Z'||val>='0'&&val<='9' ? val+" " : "The digit ascii value last digit is" + (val%10=2)  "last digit is even" : "last digit is even" :"" );
	}
}

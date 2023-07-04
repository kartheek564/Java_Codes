/*a program to check givrn value is +ve or -ve,zero
	if it is +ve and -ve print the difference from '0'
	if it is zero print the Ascii value*/
class  PNZA
{
	public static void main(String[] args) 
	{
		int a=0;
		System.out.println(a>0? a+" is Positive number " + (0-a) : a<0 ? a+" is negatvie number "+(0-a) : "It is Zero ---Ascii value of zero is " +(int)('0'));
		/*if(a>0||a<0)
		{
			System.out.println(0-a);
		}
		else{
		int temp;
		temp='0';
		System.out.println(temp);
		}*/
		}
	}

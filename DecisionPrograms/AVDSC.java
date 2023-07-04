/*A program to check given value is alphabet or vowel or digit or special character*/
class  AVDSC
{
	public static void main(String[] args) 
	{
		char a='9';
		if((a>='a'&&a<='z'||a>='A'&&a<='Z'))
		{
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			{
				System.out.print(a+" is a Vowel and " );
			}
			System.out.println(a+" is a alphabet");
		}
		else if (a>='0'&&a<='9')
		{
			System.out.println(a+" is a Digit");
		}
		else
		{
			System.out.println(a+" is Special Character");
		}
		}
}

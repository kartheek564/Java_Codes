/* A program to check weather a given value is upper case or lower case vowel or not perform the program with out using switch */
class  ULVS
{
	public static void main(String[] args) 
	{
		char val='H';
		if(val>='A'&&val<='Z')
		{
			if(val=='A'||val=='E'||val=='I'||val=='O'||val=='U')
			{
				System.out.println(val+" Upperr case Vowel" );
			}
			else
				{
				System.out.println(val+" not an Upper case Vowel");
			}
		}
			else if(val>='a'&&val<='z')
			{
				if(val=='a'||val=='e'||val=='i'||val=='o'||val=='u')
				{
				System.out.println(val+" Lower case Vowel" );
				}
				else
					{
				
				System.out.println(val+" not an Lower case Vowel");
				}
			}

		else
			{
				
				System.out.println(val+" not an Alphabet");
				
		}
	
	}
	}


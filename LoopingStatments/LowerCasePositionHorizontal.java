class LowerCasePositionHorizontal 
{
	public static void main(String[] args) 
	{
		int pos=0;
		for (char ch='a';ch<='z' ;ch++ )
		{
			System.out.print(ch+" ");	
		}
		System.out.println();
		for (char ch='a';ch<='z' ;ch++ )
		{
			pos++;
			System.out.print(pos+" ");
			
		}
		System.out.println();
	}
}

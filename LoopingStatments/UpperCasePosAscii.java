class  UpperCasePosAscii
{
	public static void main(String[] args) 
	{
		int pos=1;
		for (char c='A';c<='Z' ;c++ )
		{
			System.out.print(pos+" ");
			pos++;
		}
		System.out.println();
		//System.out.println("=======Position=======");
		for (char c='A';c<='Z' ;c++ )
		{
			System.out.print(c+" ");
		}
		System.out.println();
		//System.out.println("=======Alphabets=======");
		for (char c='A';c<='Z' ;c++ )
		{
			System.out.print((int)c+" ");
		}
		System.out.println();
		//System.out.println("=======Ascii Values=======");
	}
}

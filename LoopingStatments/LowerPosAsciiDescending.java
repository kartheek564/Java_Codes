class LowerPosAsciiDescending
{
	public static void main(String[] args) 
	{
		int i=26;
		for (char c='z';c>='a' ;c-- )
		{
			System.out.println(i--+") "+c+"--"+"-->"+(int)c);
		}
	}
}

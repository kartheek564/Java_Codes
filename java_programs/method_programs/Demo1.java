class Demo1 
{
	public static void add()
	{
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println("The division of "+a+" and "+b+" is : "+c);
	}
	public static void main(String[] args) 
	{
		System.out.println("This is the two Static methods.");
		add();
		sub();
	}
	public static void sub()
	{
		int a=10;
		int b=5;
		int c=a-b;
		System.out.println("The Substraction of "+a+" and "+b+" is : "+c);
	}
}

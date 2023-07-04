class Sample1
{
	public void add()
	{
		int a=100;
		int b=50;
		int c=a+b;
		System.out.println("The addition of "+a+" and "+b+" is : "+c);
	}
	public static void main(String[] args) 
	{
		Sample1 d=new Sample1();
		System.out.println("This is two non Static methods");
		d.add();
		d.mul();
	}
	public void mul()
	{
		int a=20;
		int b=3;
		int c=a*b;
		System.out.println("The multiplication of "+a+" and "+b+" is "+c);
	}
}

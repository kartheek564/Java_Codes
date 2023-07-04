class Sample
{
	public void mod()
	{
		int a=10;
		int b=5;
		int c=a%b;
		System.out.println("The modulus of "+a+" and "+b+" is : "+c);
	}
	public static void main(String[] args) 
	{
		Sample d=new Sample();
		System.out.println("This is in non Static method");
		d.mod();
	}
}

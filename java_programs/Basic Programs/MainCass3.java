class A 
{
	public  void add()
	{
		System.out.println("method overriding");
		System.out.println("a:");
	}
}

class B extends A
{
	public void add()
	{
		
	}
}

class MainCass3
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		A a1 = new A();
		a1.add();
		B b1 = new B();
		b1.add();
		System.out.println("Main Ends");
	}
}
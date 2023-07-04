class A
{
	public void wings()
	{
		System.out.println("Use wings");
	}
}
class B extends A
{
	public void wheels()
	{
		System.out.println("Use wheels");
	}
}
class MainClass
{
	public static void main(String[] args) 
	{
		System.out.println("Upcasting");
		A a1= (A) new B();
		a1.wings();
		System.out.println("Downcasting");
		B b1 = (B)a1;
		b1.wings();
		b1.wheels();
	}
}

class A
{
	public void read()
	{
		System.out.println("Read");
	}
} 
class B extends A
{
	public void write()
	{
		System.out.println("And Write");
	}
}
class C extends A
{
	public void learn()
	{
		System.out.println(" And Learn");
	}
}
class MainClass1
{
	public static void main(String[] args) 
	{
		System.out.println("upcasting");
		A a1 = (A) new B();
		a1.read();
		System.out.println("downcasting");
		B b1 = (B) a1;
		b1.read();
		b1.write();
		System.out.println("upcasting");
		A a2 = (A) new C();
		a2.read();
		System.out.println("downcasting");
		C c1 = (C) a2;
		c1.read();
		c1.learn();
	}
}
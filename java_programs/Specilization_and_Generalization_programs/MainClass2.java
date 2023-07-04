class A
{
	public void work()
	{
		System.out.println("Work from home");
	}
	public void getSalary()
	{
		System.out.println("get salary by the end of month");
		System.out.println("===============================");
	}
}
class B extends A
{
}
class C extends A
{
}
class MainClass2 
{
	public static void job(A a)
	{
		a.work();
		a.getSalary();
	}
	public static void main(String[] args) 
	{
		job(new B());
		job(new C());
	}
}
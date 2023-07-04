interface A
{
	public void read(); 
}
interface B extends A
{
	public void write(); 
}
interface C extends A
{
	public void learn(); 
}
class Demo implements C
{
	public void read()
	{
		System.out.println("Reading");
	}
	public void write()
	{
		System.out.println("Writing");
	}
	public void learn()
	{
		System.out.println("learning");
	}
}
class MainClass3 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Demo d1=new Demo();
		d1.read();
		d1.write();
		d1.learn();
		System.out.println("main ends");
	}
}

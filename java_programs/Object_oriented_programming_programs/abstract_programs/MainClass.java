abstract class Demo 
{
	abstract public void run();
}
class sample extends Demo
{
	public void run()
	{
		System.out.println("Run complete");
	}
}
class MainClass 
{
	public static void main(String[] args) 
	{
		new sample().run();
	}
}

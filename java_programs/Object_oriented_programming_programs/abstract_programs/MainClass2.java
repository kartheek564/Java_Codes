abstract class Bike
{
	abstract public void start();
	abstract public void stop();
}
class R15 extends Bike
{
	public void start()
	{
		System.out.println("Bike Starts");
	}
	public void stop()
	{
		System.out.println("Bike stops");
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		R15 r = new R15();
		r.start();
		r.stop();
	}
}

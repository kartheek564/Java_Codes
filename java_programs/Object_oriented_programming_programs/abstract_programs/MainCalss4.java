abstract class Book
{
	abstract public void write();
	public void read()
	{
		System.out.println("Reading complete");
	}
}
class Biography extends Book
{
	public void write()
	{
		System.out.println("write complete");
	}
}
class MainCalss4 
{
	public static void main(String[] args) 
	{
		Biography b= new Biography();
		b.write();
		b.read();
	}
}

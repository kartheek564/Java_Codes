class Mobile
{
	public static void call()
	{
		System.out.println("Calling ");
	}
	public static void chat()
	{
		System.out.println("Chatting ");
	}
}
class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts ");
		Mobile.call();
		new Mobile().chat();
		System.out.println("Main Ends ");
	}
}

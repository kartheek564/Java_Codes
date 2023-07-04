class Call
{
	public static String c = "Call";
	public String m = "Message";
	public void call()
	{
		System.out.println("Calling");
		System.out.println(c);
		System.out.println(m);
	}
}
class Message
{
	public void mesg()
	{
		Call call = new Call();
		call.call();5
		System.out.println("Messaging");
	}
}
class Play
{
	public static void play()
	{
		Message message = new Message();
		message.mesg();
		System.out.println("Playing Games");
	} 
}
class Mobile 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Play.play();
		System.out.println("Main Ends");
	}
}

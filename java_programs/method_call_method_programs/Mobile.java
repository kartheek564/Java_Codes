class Mobile 
{
	public void call()
	{
		System.out.println("call starts...");
		mesg();
		System.out.println("call Ends...");
	}
	public void mesg()
	{
		System.out.println("message starts...");
		System.out.println("message Ends...");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		Mobile mobile = new Mobile();
		mobile.call();
		System.out.println("Main Ends...");
	}
}

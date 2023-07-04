class gmailAccount 
{
	private String password;
	public void validatePassword(String password)
	{
		if (password.length()>=8)
		{
			this.password=password;
			System.out.println("Password set successfully");
		}
		else
		{
			System.err.println("Password contains minimum 8 characters");
		}
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		gmailAccount g1 = new gmailAccount();
		g1.validatePassword("Kartheek@123");
	}
}

package P1;
public class ThrowsProgram
	 {
	 	public static void div(int a) throws Exception
	 	{
	 		if(a<18)
	 		{
	 			throw new Exception("Not eligible for vote");
	 		}
	 		else
	 		{
	 			System.out.println("Eligible for vote");
	 		}
	 	}
	 	public static void main(String[] args) throws Exception
	 	{
	 		ThrownProgram tp = new ThrownProgram();
	 		try
	 		{
	 			div(10);
	 		}
	 		catch(ArithmeticException e)
	 		{
	 			System.out.println("Exception Handled");
	 		}
	 	}
	 }

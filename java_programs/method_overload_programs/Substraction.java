class Substraction 
{
	public static void substract(int a,int b) 
	{
		System.out.println("Inside test method with int,int args");
		System.out.println("Substraction of "+a+" and "+b+" is "+(a-b));
	}
	public static void substract(int  a,int b,double c) 
	{
		System.out.println("Inside test method with int,int,double args");
		System.out.println("Substraction of "+a+" "+b+" and "+c+" is "+((a-b)-c)) ;
	}
	public void substract(int a,double b) 
	{
		System.out.println("Inside test method with int,double args");
		System.out.println("Substraction of "+a+" and "+b+" is "+(a-b)) ;
	}
	public void substract(double a,int b) 
	{
		System.out.println("Inside test method with double,int args");
		System.out.println("Substraction of "+a+" and "+b+ " is "+(a-b)) ;
	}

	public static void main(String[] args) 
	{
		Substraction sub = new Substraction();
		System.out.println("main starts");
			substract(10,5);
			substract(50,6,40.5);
			sub.substract(15,5.5);
			sub.substract(35.5,30);
		System.out.println("main ends");
	}
}

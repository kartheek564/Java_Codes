class Multiplication 
{
	public static void multiply(int a,double b) 
	{
		System.out.println("Inside test method with int,double args");
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
	}
	public static void multiply(double d,double e) 
	{
		System.out.println("Inside test method with double,double args");
		System.out.println("Multiplication of "+d+" and "+e+" is "+(d*e)) ;
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
			multiply(10,5.5);
			multiply(5.5,6.5);
		System.out.println("main ends");
	}
}

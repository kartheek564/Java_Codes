class Test 
{
	public String colur = "Red";
	public void write()
	{
		System.out.println(colur);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts ");
		Test test = new Test();
		test.write();
		System.out.println("Main Ends ");
	}
}

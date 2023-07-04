class Sample 
{
	public int a =40;
	public void display()
	{
		String a = "Using This operator";
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sample sample = new Sample();
		sample.display();
		System.out.println("Main ends");
	}
}

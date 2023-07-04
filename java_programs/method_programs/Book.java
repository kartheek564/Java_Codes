class Book 
{
	public static void read()
	{
		System.out.println("Read book");
	}
	public static void main(String[] args) 
	{
		System.out.println("In book we can ");
		Book b=new Book();
		b.write();
		read();
	}
	public void write()
	{
		System.out.println("write in book");
	}
}

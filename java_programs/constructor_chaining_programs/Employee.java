class Employee 
{
	public int id;
	public String name;
	public int sal;
	public int yoe;
	public void Employee(int id,String name,int sal,int yoe)
	{
		this(id,name,sal);
		this.yoe=yoe;
	}
	public void Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void employeDetails()
	{
		System.out.println("id :"+id);
		System.out.println("name :"+name);
		System.out.println("salary :"+sal);
		if (yoe!=0)
		{
			System.out.println("Years of experience :"+yoe);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Employee e1 = new Employee(0101,"Kartheek",50000,2);
		e1.employeDetails();
		Employee e2 = new Employee(0012,"Sai",12000);
		e2.employeDetails();
		System.out.println("Main Ends");
	}
}

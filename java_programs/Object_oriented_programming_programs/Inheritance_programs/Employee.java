class Employee 
{
	public int id;
	public String name ;
	public int salary;
	public Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name = name;
		this.salary = salary;
	}
	public void EmployeeInfo()
	{
		System.out.println("Id : "+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
	}
}

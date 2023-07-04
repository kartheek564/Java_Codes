class Student 
{
	public String name;
	public int tenth;
	public int inter;
	public int degree;
	public int masters;
	public Student(String name,int tenth,int inter,int degree,int masters)
	{
		this(name,tenth,inter,degree);
		this.masters=masters;
	}
	public Student(String name,int tenth,int inter,int degree)
	{
		this.name=name;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
	}
	public void printStudentDetails()
	{
		System.out.println("name "+name);
		System.out.println("tenth "+tenth);
		System.out.println("inter "+inter);
		System.out.println("degree "+degree);
		if (masters!=0)
		{
			System.out.println("masters "+masters);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Student s1 = new Student("Kartheek",80,81,66);
		s1.printStudentDetails();
		System.out.println("==================");
		Student s2 = new Student("Sai",90,91,96,94);
		s2.printStudentDetails();
		System.out.println("Main Ends");
	}
}

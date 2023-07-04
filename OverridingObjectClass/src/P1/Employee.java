package P1;
public class Employee {
	private int eId;
	private double eSalary;
	private String eName;
	public Employee(int eId,double eSalary,String eName)
	{
		this.eId = eId;
		this.eSalary = eSalary;
		this.eName = eName;
	}
	public String toString()
	{
		return "Employee Name" + eName;
	}
	//public int hashCode()
	//{
	//	return "eSalary" + eSalary;
	//}
	public boolean equals(Object o1)
	{
		Employee e1 = (Employee )o1;
		return false;
	}
	public static void main(String[] args)
	{
		
	}
}

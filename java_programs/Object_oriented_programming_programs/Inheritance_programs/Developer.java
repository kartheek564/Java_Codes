class Developer extends Employee 
{
	public String tol;
	public Developer(String tol)
	{
		this.tol= tol;
	}
	public void DeveloperInfo()
	{
		System.out.println("Type of language : "+tol);
	}
}

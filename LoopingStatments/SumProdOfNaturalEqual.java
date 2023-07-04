import java.util.Scanner;
class  SumProdOfNaturalEqual
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value: ");
		int m=sc.nextInt();
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int temp=1;
		int temp1=0;
		for (int i=m;i<=n ;i++)
		{
				temp=temp*i;
				temp1=temp1+i; 
		}
			if(temp==temp1) 
			{
				System.out.println("summetation "+ temp1 +" and product " + temp + " of natural numbers between " +m+" and " +n+ " is equal ");
			}

			else
			{
				System.out.println("summetation "+ temp1 +" and product " + temp + " of natural numbers between " +m+ " and " +n+ " is not equal ");
			}
	}
}

import java.util.Scanner;
class FibbonacciNumSumLargeSmallDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int sum=0;
		int n1 = 0;
        int n2 = 1;
        int n3 = 0;
		int largest=0,smallest=9;
		while (n!=0)
		{
			int digit=n%10;
			if (largest<digit)
			{
				largest=digit;
			}
			else
			{
				smallest=digit;	
			}
			n=n/10;
		}
		System.out.println("Largest of the given number is : "+largest);
		System.out.println("Smallest of the given number is : "+smallest);
		sum=largest+smallest;
		System.out.println("The sum of largest and smallest of the given number is "+sum);
        while (n3<sum)
        {
            n3 = n1 + n2;  
            n1 = n2;
            n2 = n3;
        }
        if(n3==sum)
        {
            System.out.println(sum+" is fibbonacci number ");
        }
        else
        {
            System.out.println(sum+" is not a fibbonacci number ");
        }
	}
}

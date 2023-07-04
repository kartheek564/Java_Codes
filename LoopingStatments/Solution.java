import java.util.Scanner;
class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long sum=0l;
    
    int sizel=sc.nextInt();
    long n[]=new long[sizel];
    for(int i=0;i<sizel;i++)
    {
    n[i]=sc.nextLong();
    }
    for(int i=0;i<sizel;i++)
    {
        sum=sum+n[i];
    }
    System.out.println(sum);
    }
}

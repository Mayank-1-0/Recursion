import java.util.Scanner;
public class Gcd 
{
    public static int gcd(int n1,int n2)
    {
        
        if(n1==0) return -1;
        if(n2==0) return n1;
        return gcd(n2,n1%n2);
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the numbers");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gc=gcd(n1,n2);
        System.out.println("The result is: "+gc);
        
    }
}

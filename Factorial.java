import java.util.Scanner;
public class Factorial 
{
    public static int Fact(int n)
    {
        if(n==0) return 1;
        return n*Fact(n-1);
    }
   public static void main(String[] args) 
   {
       System.out.println("Enter the no.");
       try( Scanner sc=new Scanner(System.in))
       {
        int n=sc.nextInt();
        int Fc=Fact(n);
        System.out.println("The result is : "+Fc);
       }
   } 
}

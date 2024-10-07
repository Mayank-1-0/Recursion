import java.util.Scanner;
public class Fibonacci 
{
    public static int fibo (int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
   public static void main(String[] args) 
   {
       try( Scanner sc=new Scanner(System.in))
       {
            int n=sc.nextInt();
            int F=fibo(n);
            System.out.println("The result at "+n+" is:"+F);
       }

   } 
}

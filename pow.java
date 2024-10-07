 import java.util.Scanner;
class pow
{
    public double Power(double x, long n)
    {
         if(n==0) return 1;
         if(n<0) return 1/Power(x,-n) ;
        if(n%2==1) return x*Power(x*x,(n-1)/2);
        else
        {
            return Power(x*x,n/2);
        }
        
    }
     public static void main(String[] args) 
     {
            System.out.println("Enter the no.and its power:");
             pow  me = new pow();
            try(Scanner sc= new Scanner(System.in)){
            double x =sc.nextDouble();
            long n= sc.nextLong();
             Double Res= me.Power(x,n);
             System.out.println("the result is:" +Res);
            }
        
     } 
    }


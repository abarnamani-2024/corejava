import java.util.*;
public class arithmetic {
    private void addition(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition of two numbers is:"+c);
    }
    private void subtract(int a,int b)
    {
        int d=a-b;
        System.out.println("Subtraction of two numbers is:"+d);
    }
    private void product(int a,int b)
    {
        int e=a*b;
        System.out.println("Multiplication of two numbers is:"+e);
    }
    private void division(int a,int b)
    {
        int f=a/b;
        System.out.println("Division of two numbers is:"+f);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=s.nextInt();
        System.out.println("Enter the second number");
        int b=s.nextInt();
        arithmetic ar=new arithmetic();
        ar.addition(a,b);
        ar.subtract(a,b);
        ar.product(a,b);
        ar.division(a,b);

    }
}





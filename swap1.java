import java.util.*;
public class swap1 {
    private void change(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapping of 2 numbers are a is "+a+" b is "+b);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=s.nextInt();
        System.out.println("Enter the value of b is");
        int b=s.nextInt();
        swap1 s1=new swap1();
        s1.change(a,b);
    }
    
}

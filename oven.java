import java.util.*;
public class oven{
    private void odd(int num)
    {
     if(num%2==0)
     {
        System.out.println(num+": number is even");
     }
     else
     {
        System.out.println(num+": number is odd");
    
}
    }
public static void main(String[] args)
{
    Scanner s =new Scanner(System.in);
    System.out.println("enter the number");
    int num=s.nextInt();
    oven oe=new oven();
    oe.odd(num);
}
}

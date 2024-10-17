import java.util.*;
public class leap{
    public static void main(String[] args)
    {
    
        Scanner s=new Scanner(System.in);
        System.out.println("enter the year:");
        int a=s.nextInt();
        if(a%4==0)
        {
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
    }
    
    
}

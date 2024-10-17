import java.util.*;
public class biggest {
    private void largest(int a, int b,int c)
    {
        if(a>b&&a>c)
        System.out.println("Largest number is A:"+a);
        else if(b>a&&b>c)
        System.out.println("Largest number is b:"+b);
        else 
        System.out.println("Largest number is c"+c);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first num");
        int a=s.nextInt();
        System.out.println("Enter the second num");
        int b=s.nextInt();
        System.out.println("Enter the third num");
        int c=s.nextInt();
        biggest bg=new biggest();
        bg.largest(a,b,c);



    }
    
}

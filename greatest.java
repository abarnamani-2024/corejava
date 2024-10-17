import java.util.*;
public class greatest{
    private void bigno(int a,int b,int c)
    {
        if(a>b&&a>c)
        System.out.println(a+"is a greates number");
        else if(b>a&&b>c)
        System.out.println(b+"is a greastes number");
        else 
        {
        System.out.println(c+"is a greatest number");
        }
    }
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=s.nextInt();
        System.out.println("Enter the second number");
        int b=s.nextInt();
        System.out.println("Enter the third number");
        int c=s.nextInt();
        greatest g=new greatest();
        g.bigno(a,b,c);
    }
    
}

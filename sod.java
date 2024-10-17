import java.util.*;
public class sod {
    private void digit(int a)
    {
        int c,d,e;
        c=a%10;
        d=a/10;
        e=c+d;
        System.out.println(+e);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the digit");
        int a=s.nextInt();
        sod dig=new sod();
        dig.digit(a);
    }
}

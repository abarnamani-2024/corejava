import java.util.*;
public class digit
{
    private void number(int i)
    {
        int c=0;
        if(i==0)
        {
        System.out.println("number of digit is 1");
        } else
        while(i!=0)
        {
           c++;
           i=i/10;

        }
        System.out.println("number of digit is:"+c);


    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the number:");
        int i=s.nextInt();
        digit d=new digit();
        d.number(i);
    }
}
import java.util.*;
public class prime{
    private void number(int a)
    {
        if(a%2!=0)
        {
        System.out.println("Not a prime number");
    }
    else
    {
        System.out.println("Prime number");
    }
}
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        prime p=new prime();
        p.number(a);
    }

}

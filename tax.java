import java.util.*;
public class tax {
    private void price(int i)
    {
        if(i>100000)
        {
            int t1=(i*15/100);
            System.out.println("Your Tax amount is :"+t1);
          

        }else if(i>50000&&i<=100000)
        {
            int t2=(i*10/100);
            System.out.println("Your Tax amount is :"+t2);
        }else if(i<=50000)
        {
        int t3=(i*5/100);
        System.out.println("Your Tax amount is:"+t3);
       }else 
       {
       System.out.println("No Tax to be paied");
       }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The amount:");
        int i=s.nextInt();
        tax t=new tax();
        t.price(i);
    }
}

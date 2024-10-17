import java.util.*;
public class pattern {
    public static void main(String[] args)
    {  
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=s.nextInt();
       int i,j;
       for(i=1;i<=n;i++)
       {
        for(j=1;j<=i;j++)
        {
            System.out.print("* ");

        }
        System.out.print("\n");

       }
    }
}

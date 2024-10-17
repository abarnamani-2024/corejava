import java.util.*;
public class value {
    private void positive(int i)
    {
        
        if(i<0)
        {
            System.out.println(i+": number is negative");
        }else if(i>0){
            System.out.println(i+": number is Positive number");
        }else 
        {
            System.out.println("Given number is 0");
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check positive or negative");
        int i=s.nextInt();
        value v=new value();
        v.positive(i);
    }

}

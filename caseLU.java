import java.util.*;
public class caseLU{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name to be converted into lowercase:");
        String name=s.nextLine();
        System.out.println("Lower case of a word is:"+name.toLowerCase() +" and count is "+name.length());
        System.out.println("Enter the name to be converted into Uppercase:");
        String name1=s.nextLine();
        System.out.println("Upper case of a word is:"+name1.toUpperCase() +" and count is " +name1.length());

    }
    
}

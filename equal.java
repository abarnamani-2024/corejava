import java.util.*;
public class equal{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the first word:");
        String n1=s.nextLine();
        System.out.println("Enter the next Word:");
        String n2=s.nextLine();
        System.out.println("given two words are:"+n1.equalsIgnoreCase(n2));
        System.out.println("Given two letter are: "+n1.equals(n2));
        System.out.println("Checking @ in a given letter:"+n1.contains('@'));
    }
    
}

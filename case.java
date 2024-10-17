import java.util.*;
public class case{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name to be converted into lowercase:");
        String name=s.nextLine();
        System.out.println("Lower case of a word is:"+name.toLowercase());
    }
    
}

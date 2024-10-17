import java.util.*;
public class percentage {
    private void perc(int percent)
    {
        
        System.out.println("Percentage of marks :"+percent);
        if(percent>90)
        {
            System.out.println("A");
        } else if(percent>80&&percent<=90)
        {
            System.out.println("B");
        }
        else if(percent>60&&percent<=80)
        {
            System.out.println("C");
        }
        else if(percent<60)
        {
            System.out.println("D");
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the percentage");
        int percent=s.nextInt();
        percentage p=new percentage();
        p.perc(percent);
    }
    
}

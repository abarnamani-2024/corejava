import java.util.*;
public class currency{
    private void dir(float rps)
    {
        float dirhams=(rps*22.75f);
        System.out.println("Your indian amount is:"+dirhams);
    }
    private void dollar(float rps)
    {
       float dol=(rps*80.53f);
        System.out.println("Your indian amount is:"+dol);


    }
    public static void main(String[] args)
    { 
        Scanner s=new Scanner(System.in);
        System.out.println("ENter your rupees:");
        float rps=s.nextFloat();
        currency c=new currency();
        c.dir(rps);
        c.dollar(rps);

    }
}
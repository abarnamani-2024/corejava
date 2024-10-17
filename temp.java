import java.util.*;
public class temp {
    private void fahren(float f,float c)
    {
        float ftc=(f-32)*5/9;
        System.out.println("celsius is:"+ftc);
    }
    private void celsius(float f,float c)
    {
        float ctf=((9*c)/5)+32;
        System.out.println("fahrenheit is:"+ctf);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("fahrenheit is:");
        float f=s.nextFloat();
        System.out.println("Celsius is:");
        float c=s.nextFloat();
        temp t=new temp();
        t.fahren(f,c);
        t.celsius(f,c);
    }
}

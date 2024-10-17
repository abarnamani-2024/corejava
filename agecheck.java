import java.util.*;
public class agecheck {
private void age1(int age)
{
    if(age>=18)
    {
        System.out.println("You are eligible for voting");
    }else{
        System.out.println("You are not eligible for voting");
    }
}
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age=s.nextInt();
        agecheck a=new agecheck();
        a.age1(age);

    }
}


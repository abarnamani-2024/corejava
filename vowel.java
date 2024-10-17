import java.util.*;
public class vowel {
    private void alpha(char name)
    {
      
        if(name=='a'||name=='e'||name=='i'||name=='o'||name=='u'||name=='A'||name=='E'||name=='I'||name=='O'||name=='U')
        {
            System.out.println(name+": Its a vowel");
        }
        else
        {
            System.out.println(name+": its a consonant");
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a name");
        char name=s.next().charAt(0);
        vowel v=new vowel();
        v.alpha(name);

    }
    
}

import java.util.*;
public class conversion {
    private void convert(int amt,int choice)
    {
      switch(choice)
      {
        case 1:
        int dol=amt*82;
        System.out.println("Your dollar is:"+dol);
        break;
        case 2:
        int euro=amt*52;
        System.out.println("Your Euro amount is:"+euro);
        break;
        case 3:
        int dirah=amt*22;
        System.out.println("Your Dirahms is:"+dirah);
        break;
        case 4:
        int yen=amt*15;
        System.out.println("Your Yen is:"+yen);
        break;

      }
    }
 public static void main(String[] args)
 {
    Scanner s=new Scanner(System.in);
    System.out.println("ENter the Indian rupees to be converted:");
    int amt=s.nextInt();
    System.out.println("Converted into");
    System.out.println("1.convert to dollar");

    System.out.println("2.convert to Euro");

    System.out.println("3.convert to dirahms");

    System.out.println("4.convert to yen");
    System.out.println("Enter your choice:");
    int choice=s.nextInt();
    conversion c=new conversion();
    c.convert(amt,choice);



 }   
}

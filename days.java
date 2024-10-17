import java.util.*;
public class days {
    private void month(int i,int y)
    { 
        if(i==2&&y%4==0)
        {
            System.out.println("Its a leap year so no of days is 29");
        }else if(i==2)
        {
            System.out.println("No of days is 28");
        }
        else if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
        {
            System.out.println("no of days is 31");
        }
        else {
            System.out.println("no of days is 30");
        }
           
           
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the month");
        int i=s.nextInt();
        System.out.println("Enter the Year");
        int y=s.nextInt();

        days m=new days();
        m.month(i,y);
    }
}

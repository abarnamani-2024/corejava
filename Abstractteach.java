public class Abstractteach  extends Abstractstd{
    @Override
    public void stdName()
    {
        System.out.println("ABarna");
    }

    @Override
    public void stdRollno()
    {
        System.out.println("1001");
    }
    public void studMark()
    {
        System.out.println("100");
    }
    public static void main(String[] args)
     {
        Abstractteach tc=new Abstractteach();
        tc.stdName();
        tc.stdAge();
        tc.studMark();
        tc.stdRollno();
     }

}

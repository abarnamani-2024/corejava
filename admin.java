public class admin implements std,teacher {
    @Override
    public void stdName(){
        System.out.println("Abarna");
    }
    @Override
    public void stdAge()
    {
        System.out.println("25");
    }
    @Override
    public void stdRollno()
    {
        System.out.println("1001");
    }
    @Override
    public void tam()
    {
        System.out.println("100");
    }
    @Override

    public void eng()
    {
        System.out.println("90");
    }
    @Override
    public void math()
    {
        System.out.println("86");
    }
    public void pswd()
    {
        System.out.println("12345");
    }
    public static void main(String[] args)
    {
        admin a=new admin();
        a.stdName();
        a.stdAge();
        a.stdRollno();
        a.tam();
        a.eng();
        a.pswd();
    }
}

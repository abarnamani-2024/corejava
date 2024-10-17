public class Dogs extends Animal{
    @Override
    public void speak()
    {
        System.out.println("SOund of dog is barking");
    }
    public static void main(String[] args)
    {
        Animal a=new Animal();
        a.speak();
        cat c=new cat();
        c.speak();
        Dogs d=new Dogs();
        d.speak();
    }
}
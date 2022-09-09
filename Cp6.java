package animals;
interface animal
{
    public void eat();
    public void travel();
}
class Dog implements animal
{
    public void eat()
    {
        System.out.println("The Dog eats : Pedigree");
    }
    public void travel()
    {
        System.out.println("The Dog wanders outside");
    }
}
class Rabbit implements animal
{
    public void eat()
    {
        System.out.println("The Rabbit eats : Carrot");
    }
    public void travel()
    {
        System.out.println("The Dog travels by hopping");
    }
}
public class Cp6 {
    public static void main(String[] args)
    {
        Dog myDog=new Dog();
        Rabbit Bunny=new Rabbit();
        myDog.eat();
        myDog.travel();
        Bunny.eat();
        Bunny.travel();
    }
}

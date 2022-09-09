package personpackage;
import java.util.*;
class Person
{
    String firstName="Default",lastName="default";
    public void read(String fn,String ln)
    {
        firstName=fn;
        lastName=ln;
    }
    public void Display()
    {
        System.out.println("\n Name "+firstName+" "+lastName);
    }
}
public class Cp7 {
    public static void main(String[]args)
    {
        Person P1=new Person();
        Person P2=new Person();
        P1.read("Jack","Ryan");
        P1.Display();
        P2.read("Paul","Walker");
        P2.Display(); 
    }
}

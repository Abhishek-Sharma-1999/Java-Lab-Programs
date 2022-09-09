import java.util.*;
class Box
{
    double volume(double length,double breadth,double height)
    {
        return (length*breadth*height);
    }
}
public class Ap6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length,Breadth and Height of First Box :");
        double a=sc.nextFloat();
        double b=sc.nextFloat();
        double c=sc.nextFloat();

        System.out.println("Enter Length,Breadth and Height of Second Box :");
        double d=sc.nextFloat();
        double e=sc.nextFloat();
        double f=sc.nextFloat();


        Box ob1=new Box();
        Box ob2=new Box();

        System.out.println("Box 1 volume "+ob1.volume(a,b,c));
        System.out.println("Box 2 volume "+ob2.volume(d,e,f));


    }
}
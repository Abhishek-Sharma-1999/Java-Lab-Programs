import java.util.*;
public class Ap3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter an Integer");
        int a=sc.nextInt();
        
        System.out.println("Enter a Double");
        double b=sc.nextDouble();
        
        System.out.println("Enter a Byte");
        byte c=sc.nextByte();
        
        System.out.println("Enter a Float");
        float f=sc.nextFloat();

        int i1;
        short s1;
        double d1;
        char c1;
        float f1;
        byte b1;

        i1=a;
        b1=(byte)i1;
        System.out.println("Int to byte : "+b1);

        
        d1=b;
        i1=(int)d1;
        System.out.println("Double to Int :"+i1);

        b1=(byte)d1;
        System.out.println("Double to Byte : "+b1);

        c1=(char)i1;
        System.out.println("Int to Char : "+c1);

        f1=f;
        s1=(short)f1;
        System.out.println("Float to Short : "+s1);

        }
}
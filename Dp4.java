import java.lang.reflect.InaccessibleObjectException;
import java.util.*;
public class Dp4 {
public void fun() throws InputMismatchException
{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number Between 1-10");
        try
        {
            int i=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            throw new InputMismatchException();
        }
        
}  
public static void main(String[]args)
{
    Dp4 obj=new Dp4();
    try{
        obj.fun();
    }
    catch(InputMismatchException e)
    {
        System.out.println("Only Integer value is Expected !!!! ");
    }
}
}

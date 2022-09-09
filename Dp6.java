import java.util.*;
class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class Dp6
{
   void productCheck(double weight) throws InvalidProductException{
	if(weight<100){
		throw new InvalidProductException("Product Invalid");
	}
   }
   
    public static void main(String args[])
    {
    	Dp6 obj = new Dp6();
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter Weight of Product (Min:100 gm)");
            double w=sc.nextDouble();
            obj.productCheck(w);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}
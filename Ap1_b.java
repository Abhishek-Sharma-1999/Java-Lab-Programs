import java.util.*;
class Adder
{
    public void IntegerAdder(String[] args)
    {
        int n=args.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        System.out.println("The Sum of given numbers is "+(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]));
    }
}
public class Ap1_b {
    public static void main(String args[])
    {
        Adder obj=new Adder();
        obj.IntegerAdder(args);
    }
    
}

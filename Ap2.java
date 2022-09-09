import java.util.*;
public class Ap2
{
    public static double sum(double n)
    {
        if(n<=1)
        {
            return 1;
        }
        return sum(n-1)+(1/n);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<10;i++)
        {
            System.out.print("1/"+i+"+ ");
        }
        System.out.println("1/10 = "+sum(10.0));
    }
}
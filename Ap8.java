import java.util.*;
public class Ap8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double base_pay,amount=0,hours;

        System.out.println(" \n Enter Number of Hours an Employee Work");
        hours=sc.nextFloat();
        System.out.println("Enter Base Pay (Not Less than $8.0)");
        base_pay=sc.nextFloat();
        if(hours>60 || base_pay<8)
        {
            System.out.println(" ERROR !! ");
        }
        else if(hours>40)
        {
            amount=base_pay*1.5*hours;
            System.out.println("Total Amount is "+ " $ " +amount);
        }
        else
        {
            amount=base_pay*hours;
            System.out.println("Total Amount is "+ " $ " +amount);
        }    
    }
}
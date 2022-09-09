import java.util.*;
interface Account
{
    public void openacc();
    public void closeacc();
    public void withdraw();
    public void deposit();
    public void transfer();

}
class SavingAccount implements Account
{
    public void openacc()
    {
        System.out.println("Account Opened in Savings Account");
    }
    public void closeacc()
    {
        System.out.println("Account Closed in Savings Account");
    }
    public void withdraw()
    {
        System.out.println("Money withdrawn from Savings Account");
    }
    public void deposit()
    {
        System.out.println("Money Deposit in Savings Account");
    }
    public void transfer()
    {
        System.out.println("Money trnsfer from Savings Account");
    }
    
}

class CurrentAccount implements Account
{
    public void openacc()
    {
        System.out.println("Account Opened in Current Account");
    }
    public void closeacc()
    {
        System.out.println("Account Closed in Current Account");
    }
    public void withdraw()
    {
        System.out.println("Money withdrawn from Current Account");
    }
    public void deposit()
    {
        System.out.println("Money Deposit in Current Account");
    }
    public void transfer()
    {
        System.out.println("Money trnsfer from Current Account");
    }
    
}

public class Cp5 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Account Type \n \t 1.Savings \t 2.Current \n \t");
        int choice=sc.nextInt();
        Account ac=null;
        switch(choice)
        {
            case 1:ac=new SavingAccount();
            break;
            case 2:ac=new CurrentAccount();
            break;
            default:
            System.out.println("Not a Valid Input \n");
            System.exit(0);        
        }
        do{
            System.out.println("\n Facilities \n 1)Opening an Account \n 2)Closing an Account \n 3)Deposit in Account \n 4)Withdraw from Account \n 5)Transfer from Account \n \t");
            int bankchoice=sc.nextInt();
            switch(bankchoice)
            {
                case 1:ac.openacc();
                break;
                case 2:ac.closeacc();
                break;
                case 3:ac.deposit();
                break;
                case 4:ac.withdraw();
                break;
                case 5:ac.transfer();
                break;
                default:System.out.println("Invalid Choice \n");
            }
            System.out.println("\n 1).Coninue \n 2).Exit \n");
            int continuechoice=sc.nextInt();
            switch(continuechoice)
            {
                case 1:continue;
                case 2: System.exit(0);
                default:System.out.println("Invalid Choice \n");
            }
        } while(true);
    }
}

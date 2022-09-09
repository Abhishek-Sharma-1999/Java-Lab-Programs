import java.util.*;
public class demo
{
	public static void main(String[] args) {
		int year;
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter a Year");
         year=scan.nextInt();
         scan.close();
         boolean isLeap=false;

         if(year%4==0 && year%100!=0)
         {
            System.out.println("Leap Year");
         }
         else if(year%400==0)
         {
            System.out.println(" Leap Year");
         }
         else
         {
             System.out.println("Not a Leap Year");
         }
	}
}

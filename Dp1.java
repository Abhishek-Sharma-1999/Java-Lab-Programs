import java.util.*;
import java.text.*;
public class Dp1 
{
    public static void main(String[] args)
    { 
    try{ 
        do { 
        Scanner sc = new Scanner(System.in); 
        DecimalFormat f = new DecimalFormat("##.00"); 
        System.out.print("\n\t Gravity Calculator\n"); 
        System.out.print("\n Acceleration,\t\t a (- 9.81m/s^2)= "); 
        double a = sc.nextDouble(); 
        System.out.print(" Time Period,\t\t t (10s)\t= "); 
        double t = sc.nextDouble(); 
        System.out.print(" Initial Velocity,\t vi (0m/s)\t= "); 
        double vi = sc.nextDouble(); 
        System.out.print(" Initial Position,\t xi  (0m)\t= "); 
        double xi = sc.nextDouble(); 
        double xt = (0.5 * (a * t * t) + vi * t + xi); 
        String ans = "\n Final Position,\t x(t) \t\t= " + f.format(xt) + "m\n"; 
        System.out.print("-".repeat(52)+ans); 
        System.out.print("-".repeat(52)+"\n\n 1.  Continue\t2. Exit\n :"); 
        int contiCh = sc.nextInt(); 
        switch (contiCh) { 
        case 1: 
        continue; 
        case 2: 
        System.exit(0); 
        default: 
        System.out.println("Invalid Choice"); 
    } 
} while (true); 
} 
catch(NumberFormatException e1){ 
System.out.print("\n Divide by Zero Exception!"); 
} 
} 
}

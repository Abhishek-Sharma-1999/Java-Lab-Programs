import java.util.*;
public class Bp8{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s,temp;
        System.out.println("Enter a String ");
        s=sc.nextLine();
        String sub;
        System.out.println("Enter a Sub-string");
        sub=sc.nextLine();
        System.out.println("Enter another String ");
        temp=sc.nextLine();
        System.out.println("Enter a Character ");
        String ch=sc.nextLine();
        System.out.println("Enter an Index ");
        int a=sc.nextInt();
       
        System.out.println("Character at this Index is "+s.charAt(a));
       
        System.out.println("Length of string is "+s.length());
        
        
        if(s.contains(sub))
        {
            System.out.println("Sub-string is present in String ");
        }
       
        if(s.equals(temp))
        {
            System.out.println("Both Strings are Equal");
        }
       
        
        System.out.println("Index of Character is "+s.indexOf(ch));

       System.out.println("String Split by Character "+ch+ " is "+Arrays.toString(s.split(ch)));


        System.out.println("String in Uppercase is "+s.toUpperCase());
        
    }
}
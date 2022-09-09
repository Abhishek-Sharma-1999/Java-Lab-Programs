import java.util.*;
public class Cp2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String s=sc.nextLine();
        String temp="";
        for(int i=s.length()-1;i>=0;i--)
        {
            temp=temp+s.charAt(i);
        }
        if(s.equals(temp))
        System.out.println("String is Palaindrome");
        else
        System.out.println("xxx (Not Palaindrome)");
    }
}

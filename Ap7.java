import java.util.*;
public class Ap7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s="Abc is a Word",a="";
        char ch;
        System.out.println("Enter a String");
        s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--)
        {
            ch=s.charAt(i);
            a=a+ch;
        }
        System.out.println("Reversed String "+a);
    }
}
import java.util.*;
import java.lang.*; 
public class Cp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        String ans="",text=" ";
        System.out.println("Enter Ciphertext String ");
        text=sc.nextLine().toUpperCase();
        System.out.println("Enter Key ");
        int key=sc.nextInt();
        for(int i=0;i<text.length();i++)
        {
            ch=text.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                ch=(char)(ch-key);
                if(ch<'A')
                {
                    ch=(char)(ch-'A'+'Z'-1);
                }
                ans=ans+ch;
            }
            else
            {
                ans=ans+ch;
            }    
        }
        System.out.println("Plain text String "+ans);      
    }   
}

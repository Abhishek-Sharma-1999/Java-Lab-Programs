import java.util.*;
public class VowelFilter
{
    public static String filtervowel(char ch[]) 
    {
        char ans[]=new char[80];
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='a'||ch[i]!='e'||ch[i]!='i' ||ch[i]!='o' ||ch[i]!='u' ||ch[i]!='A' ||ch[i]!='E' ||ch[i]!='I' ||ch[i]!='O' ||ch[i]!='U')
            {
                ans=ans+ch[i];
            }
        }
        return ans;    
    }
}

public class Bp3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of your Character Array ");
        int size=sc.nextInt();
        char ch[]=new char[size];
        System.out.println("Enter your Character Array ");
        for(int i=0;i<size;i++)
        {
            ch[i]=sc.next().toCharArray();
        }
        
    }
}
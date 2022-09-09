import java.util.*;
public class Bp6 {
    public static void main(String[] args)
    {
        //Input with Command line
        String []city=args;
        String temp;
        for(int i=0;i<city.length;i++)
        {
            for(int j=i+1;j<city.length;j++)
            {
                int check=city[i].compareToIgnoreCase(city[j]);
                if(check>0)
                {
                    temp=city[i];
                    city[i]=city[j];
                    city[j]=temp;
                }
            }
        }
        for(int i=0;i<city.length;i++)
        {
            System.out.println(city);
        }

    }
}

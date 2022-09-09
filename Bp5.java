import java.util.*;
public class Bp5 {
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     double x,y;
     System.out.println("Enter x and y Co-ordinates ");
     x=sc.nextDouble();
     y=sc.nextDouble();
     System.out.println("Enter how many Sets of point you want to Enter");
     int t=sc.nextInt();
     double points[][]=new double[t][t];
     System.out.println("Enter x and y Co-ordinates of Set of Points");
     System.out.print("x    y \n");
     for(int i=0;i<t;i++)
     {
         for(int j=0;j<t;j++)
         {
             
            points[i][j]=sc.nextDouble();
         }
     }
     double min,ans=100000,p=-1,q=-1;
     for(int i=0;i<t;i++)
     {
        for(int j=0;j<t;j++)
        {
            min=Math.sqrt((points[i][j]-x)+(points[i][j]-y));
            if(min<ans)
            {
                ans=min;
                p=points[i][j];
                q=points[i][j+1];
            }
        }
     }
     System.out.println("Nearest Points are "+p+ " and "+ q+" with distance "+ans);
    }
    
    } 
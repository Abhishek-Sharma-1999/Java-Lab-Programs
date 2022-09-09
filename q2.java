import java.util.*;
public class q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Size of Array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of Array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>maxi)
            {
                maxi=arr[i];
            }
        }
        System.out.println("Maximum Value of Array is "+maxi);
        System.out.println("Last Element of Array is "+arr[n-1]);
        if(maxi>arr[n-1])
        {
            System.out.println(maxi +" is greater than Last Element");
        }
        else 
        {
            System.out.println(arr[n-1]+" is Largest Element");
        }
    }
}
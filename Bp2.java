import java.util.*;
public class Bp2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements");
        int arr[]=new int[15];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0,count1=0,element=-1;
        System.out.println("Duplicate Elements are ");
        for(int i=0;i<arr.length-1;i++)
        {
                if(arr[i]==arr[i+1])
                {
                    System.out.print(arr[i]+"  ");
                    count++;
                    element=arr[i];
                }  
        }
        System.out.println("\n Total Duplicate Elements are "+count);
    }
}

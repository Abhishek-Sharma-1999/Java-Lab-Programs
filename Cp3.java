import java.util.*;
import java.io.*;
import java.lang.*;
public class Cp3 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Number of Students");
        int numStudents=sc.nextInt();
        int grades[]=new int[numStudents];
        int total=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        System.out.println("Enter Grade of each Student (Between 0-100)");
        for(int i=0;i<numStudents;i++)
        {
            System.out.print("Students "+(i+1)+" Grade ");
            grades[i]=sc.nextInt();
        }
        for(int i=0;i<numStudents;i++)
        {
            total=total+grades[i];
            if(min>grades[i])
            {
                min=grades[i];
            }
            if(max<grades[i])
            {
                max=grades[i];
            }
        }
        double avg=(double)total/numStudents;
        System.out.println("Average "+String.format("%.2f",avg));
        System.out.println("Minimum Grade obtained by Student "+min);
        System.out.println("Maximun Grade obtained by Student "+max);

    }
}

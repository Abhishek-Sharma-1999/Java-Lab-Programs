import java.util.*;
class StudentRegistrationCheck implements Comparable<StudentRegistrationCheck>
{
    private int marks;
    private String name;
    private int age;
    public StudentRegistrationCheck(String name,int age,int marks)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public int compareTo(StudentRegistrationCheck o)
    {
        return this.name.compareTo(o.name);
    }
    public String toString()
    {
        return "Name - "+this.name + " Age - "+this.age+" Marks - "+this.marks;
    }
}
public class Dp3 
{
    public static void main(String[]args)
    {
        TreeSet<StudentRegistrationCheck>stud=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Number of Students ");
            int n=sc.nextInt();
            System.out.println("Enter Student Details(Name,Age,Marks)");
            for(int i=0;i<n;i++)
            {
                String name=sc.next();
                int age=sc.nextInt();
                int marks=sc.nextInt();
                if(age>=12 && marks>=200)
                {
                    stud.add(new StudentRegistrationCheck(name, age, marks));
                }
            }
            for(StudentRegistrationCheck i:stud)
            {
                System.out.println(i);
            }
        }
        catch(Exception e1)
        {
            System.out.println("/n Exception !! Restart Program ");
        }
    }
}

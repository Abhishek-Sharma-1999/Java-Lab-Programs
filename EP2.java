import java.util.*;
class EP2Person implements Comparable<EP2Person>
{
 String name;
 int age;
 EP2Person (String name, int age)
 {
 this.name = name;
 this.age = age;
 }
 @Override
 public int compareTo(EP2Person o) 
 {
 return this.name.compareTo(o.name);
 }
 @Override
 public String toString() 
 {
 return " Person{" + "name='" + name + '\'' + ", age="
+ age + '}';
}
}
public class EP2 
{
 static List<EP2Person> peeps = new
ArrayList<EP2Person>();
 static Scanner sc = new Scanner(System.in);
 static void prt()
 {
 for (EP2Person i : peeps) 
 {
 System.out.println(i);
 }
 }
 static EP2Person inp()
 {
 String name = sc.next();
 int age = sc.nextInt();
 EP2Person p1 = new EP2Person(name, age);
 return p1;
 }
 public static void main(String[] args)
 {
 System.out.print("\n No. of Entries: ");
 int n = sc.nextInt(); 
 System.out.println(" Name, Age: ");
 for (int i = 0; i < n; i++) 
 {
 peeps.add(inp());
 }
 prt();
 System.out.print("\n Collections.sort(): ");s
 Collections.sort(peeps);
 prt();
 System.out.print("\n Collections.binarySearch():\n Enter Name, Age: ");
 System.out.print(" Position:"+Collections.binarySearch(peeps, inp()));
 }
} 

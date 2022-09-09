import java.rmi.*;
import java.util.Scanner;
public class HP4sc{
 public static void main(String args[]){
 int choice=0;
 Scanner sc = new Scanner(System.in);
 try{
 HP4stu access =

(HP4stu)Naming.lookup("rmi://localhost:1900"+"/DmRemote");
 do{
 System.out.println(" 0. For exit");
 System.out.println(" 1. Admit Student");
 System.out.println(" 2. Search Student");
 System.out.print(" Enter your choice: ");
 choice = sc.nextInt();
 switch(choice){
 case 0:System.exit(0);break;
 case 1:access.admitNewStudent();break;
 case 2:int r=0;
 System.out.print("Enter roll number to search: ");
 r = sc.nextInt();
 access.searchStudent(r);
 break;
 default:System.out.println("Wrong input!");
 }
 }
 while(choice!=0);
 }
 catch(Exception e){
 System.out.println(e);
 }
 }
} 

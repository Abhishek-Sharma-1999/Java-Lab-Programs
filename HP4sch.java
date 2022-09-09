import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class HP4sch extends UnicastRemoteObject implements
HP4stu{
 private int[] rollNo = new int[10];
 private String[] name = new String[10];
 private String[] address = new String[10];
 private long[] phoneNumber = new long[10];
 HP4sch() throws RemoteException{
 super();
 }
 public void admitNewStudent() throws RemoteException{
 int r=0;
 String n = "", a = "";
 long p=0;
 Scanner sc = new Scanner(System.in);
 System.out.print("\n Enter rollno: ");
 r = sc.nextInt();
 System.out.print(" Enter name: ");
 n = sc.next();
 System.out.print(" Enter phone number: ");
 p = sc.nextLong(); 
 System.out.print(" Enter address: ");
 a = sc.next();
 for(int i=0; i<10; i++){
 if(rollNo[i]==0){
 rollNo[i]=r; name[i]=n; address[i]=a;
 phoneNumber[i]=p;
 }
 }
 System.out.println(" New Student added!");
 }
 public void searchStudent(int roll) throws
RemoteException{
 int flag=0;
 for(int i=0;i<10;i++){
 if(rollNo[i]==roll){
 System.out.println("\n\t Search result \n Rollno = " + rollNo[i]);
 System.out.println(" Name = " + name[i]);
 System.out.println(" Address = " + address[i]);
 System.out.println(" Phone Number = " + phoneNumber[i]);
 flag=1; break;
 }
 }
 if(flag==0){
 System.out.println("\n\t No Record!");
 }
 }
} 

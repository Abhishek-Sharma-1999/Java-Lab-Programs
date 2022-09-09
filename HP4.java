import java.rmi.*;
import java.rmi.registry.*;
public class HP4{
 public static void main(String args[]){
 try{
 HP4stu obj = new HP4sch();
 LocateRegistry.createRegistry(1900);
 Naming.rebind("rmi://localhost:1900"+ "/DmRemote",obj);
 }
 catch(Exception e){
 System.out.println(e);
 }
 }
}
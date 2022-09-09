import java.util.*;
import java.net.InetAddress;
public class Fp1{
 public static void main(String args[]) throws Exception{
 InetAddress localhost = InetAddress.getLocalHost();
 System.out.println("System IP Address : " +
(localhost.getHostAddress()).trim());
 try {
 String SystemName =
InetAddress.getLocalHost().getHostName();
 System.out.println("System Name : "+ SystemName);
 }
 catch (Exception E) {
 System.err.println(E.getMessage());
 }
 }
} 

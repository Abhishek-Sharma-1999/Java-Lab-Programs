import java.io.*;
import java.util.*;
import java.net.*;
public class Fp5ca{
 public static void main(String[] args) throws IOException{
 InetAddress ip = InetAddress.getLocalHost();
 int port = 4444;
 Scanner scan = new Scanner(System.in);
 Socket s = new Socket(ip, port);
 DataInputStream dis = new
DataInputStream(s.getInputStream());
 DataOutputStream dos = new
DataOutputStream(s.getOutputStream());
 while(true){
 System.out.print("Enter the equation: ");
 String inp=scan.nextLine();
 if(inp.equals("bye")) break;
 dos.writeUTF(inp);
 String ans = dis.readUTF();
 System.out.println("Result is: "+ans);
 }
 }
}
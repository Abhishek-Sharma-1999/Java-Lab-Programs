import java.io.*;
import java.net.*;
import java.util.*;
public class Fp5a{
 public static void main(String[] args) throws IOException{
 ServerSocket ss = new ServerSocket(4444);
 Socket s = ss.accept();
 DataInputStream dis = new DataInputStream(s.getInputStream());
 DataOutputStream dos = new DataOutputStream(s.getOutputStream());
 while(true){
 String input = dis.readUTF();
 if(input.equals("bye")) break;
 System.out.println("Equation Received: "+input);
 StringTokenizer st = new StringTokenizer(input);
 int op1 = Integer.parseInt(st.nextToken());
 String operation = st.nextToken();
 int result=0;
 int op2 = Integer.parseInt(st.nextToken());
 if(operation.equals("+"))
 {
 result = op1 + op2;
 }
 else if(operation.equals("-"))
 {
 result = op1 - op2;
 }
 else if(operation.equals("*"))
 {
 result = op1 * op2;
 }
 else if(operation.equals("/"))
 {
 result = op1 / op2;
 }
 System.out.println("Sendimg Result...");
 dos.writeUTF(Integer.toString(result));
 }
 }
}
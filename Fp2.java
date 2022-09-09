import java.net.*;
import java.io.*; 
import java.util.*;
import java.net.InetAddress;
public class Fp2 {
 // Main driver method
 public static void main(String[] args) throws Exception{
 URL url = new URL("https://www.richdad.com/about/rich-dad");
 System.out.println("URL is:" + url.toString());
 System.out.println("protocol is: "+
url.getProtocol());
 System.out.println("file name is: "+ url.getFile());
 System.out.println("host is: " + url.getHost());
 System.out.println("path is: " + url.getPath());
 System.out.println("port is: " + url.getPort());
 System.out.println("default port is: "+ url.getDefaultPort());
 }
} 

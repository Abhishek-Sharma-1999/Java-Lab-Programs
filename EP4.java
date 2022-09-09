import java.util.*;
import java.io.*;
public class EP4{
 public static void main(String[] args) throws Exception{
 File file = new File("F:\\JAVA - ABHI  (MCA)\\Ep4.txt");
 Scanner scan = new Scanner(file);
 Map<String, Integer> map = new HashMap<>();
 while (scan.hasNext())
 {
 String word = scan.next();
 int freq = (map.get(word) == null) ? 1 : map.get(word)+1;
 map.put(word, freq);
 }
 System.out.println(map);
 }
} 

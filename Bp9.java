import java.lang.*; 
import java.util.*; 
public class Bp9{ 
 public static void main(String[] args){ 
 Scanner sc = new Scanner(System.in); 
 System.out.print("\n Enter a Row: "); 
 int n = sc.nextInt(); 
 int arr[][] = new int [n][]; 
 for(int i=1;i<=n;i++)
 { 
 for(int j=1;j<=i;j++)
 { 
 arr[i-1] = new int[j]; 
 
 } 
 } 
 System.out.println(); 
 for(int i=1;i<=n;i++){
    System.out.print("\t"); 
    for(int j=1;j<=i;j++)
    { 
    arr[i-1][j-1] = j; 
    System.out.print(arr[i-1][j-1]); 
    } 
    System.out.println(); 
    } 
    for(int i=1;i<=n;i++)
    { 
    System.out.print(" "); 
    System.out.print((" ").repeat(n-i)); 
    for(int j=1;j<=i;j++)
    { 
    System.out.print(arr[i-1][j-1]); 
    } 
    System.out.println(); 
    } 
    
    } 
   }
import java.util.*;
public class Dp10 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> intList=new ArrayList<Integer>();
        System.out.println("Enter Numbers ");
        while(sc.hasNextInt())
        {
            int i=sc.nextInt();
            intList.add(i);
        }
        Collections.sort(intList); 
        System.out.println("Numbers in Ascending Order");
        System.out.println(intList);
        System.out.println("Numbers in Descending Order");
        Collections.sort(intList,Comparator.reverseOrder());
        System.out.println(intList);
    }
}

import java.util.*;
public class Bp1 {
    public static void main(String[] args )
    {
        String[] names={"Elena","Thoms","Hamilton","Suzie","Phil","Matt","Alex","Emma","John","James","Jane"};
        int[] times={341,273,278,329,445,402,388,275,243,334,412};
        int max=times[0];
        String s=" ";
        for(int i=0;i<times.length;i++)
        {
            if(times[i]<max)
            {
                max=times[i];
                s=names[i];
            }
        }
        System.out.println("Fastest Runner is "+s+" with time "+max+" minutes ");

    }
}

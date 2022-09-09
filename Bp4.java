import java.util.*;
public class Bp4
{
    public static void main(String[] args)
    {
        char [][] answers={
            {'A','B','A','C','C','D','E','E','A','D'} ,
            {'D','B','D','C','C','A','E','E','A','D'} ,
            {'E','D','D','A','C','B','E','E','A','D'} ,
            {'C','B','E','A','D','A','B','D','B','C'} ,
            {'E','C','A','C','E','C','D','E','A','D'} ,
            {'D','E','E','E','C','D','A','C','A','D'} ,
            {'B','A','C','A','C','A','C','E','A','D'} ,
            {'B','C','E','C','A','D','E','B','B','A'} ,
            {'C','E','C','C','B','C','D','C','B','D'} ,
            {'E','E','B','D','C','D','E','D','A','E'} };
            
            char[] keys={'D','B','D','C','C','D','A','E','A','D'};
            for(int i=0;i<answers.length;i++)
            {
                int correctcount=0,max=-1;
                for(int j=0;j<answers[i].length;j++)
                {
                    if(answers[i][j]==keys[j])
                    {
                        correctcount++;
                    }
                }
                System.out.println(i+1 +" Student marks is "+correctcount);
            }


    }
}
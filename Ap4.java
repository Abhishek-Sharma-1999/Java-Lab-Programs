import java.util.*;
public class Ap4
{
    public static void main(String[] args)
    {
        String text = "To be or not to be, that is the question;"+"Whether this nobler in the mind to suffer"+" the slings and arrows of outrageous fortune,"+" or to take arms against a sea of troubles,"+" and by opposing end them?";
        int spaces = 0, vowels = 0, letters = 0,consonants=0;
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(ch!=' ' && ch!=';' && ch!=',' && ch!='?')
            {
                letters++;
            }
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' )
            {
                vowels++;
            }
            if(ch==' ')
            {
                spaces++;

            }
            else{
                consonants++;
            }
        }
        System.out.println("The Letters in text "+letters);
        System.out.println("The Vowels in text "+vowels);
        System.out.println("The Consonants in text "+(letters-vowels));
        System.out.println("The spaces in text "+spaces);


    }
}        
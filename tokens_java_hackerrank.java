import java.util.*;
class tokens_java_hackerrank
{

    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        String str= "Hii I,m Devanshi";
        String Array[] = str.split("[, ' ? ! ]+");
        System.out.println(Array.length);
        for(int i=0;i<Array.length;i++)
        {
            System.out.println(Array[i]);
        }
    }
}

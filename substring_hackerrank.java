import java.io.*;
import java.util.*;

public class substring_hackerrank
{

    public static void main(String[] args)
    {
        Scanner S = new Scanner (System.in);
        String s1 = S.next();
        int start = S.nextInt();
        int end = S.nextInt();
        System.out.println(s1.substring(start,end));
    }
}
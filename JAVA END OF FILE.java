import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String line1;
        int i = 1;
        while(input.hasNext())
        {
            line1 = input.nextLine();
            System.out.println(i + " "+ line1);
            i++;
        }
    }
}

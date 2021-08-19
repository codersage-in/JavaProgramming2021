package com.company;

import java.util.Scanner;

public class javaanagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
        {
            return false;
        }
        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(ac);
        java.util.Arrays.sort(bc);
        for (int i = 0; i < ac.length; ++i)
        {
            if (ac[i] != bc[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

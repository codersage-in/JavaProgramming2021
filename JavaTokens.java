import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine().trim();
        if(s.length()>0){
            String arraystr[] = s.trim().split("[ -,_!'?.@]+");

            System.out.println(arraystr.length);
            for(int i=0;i<arraystr.length;i++)
            {
                System.out.println(arraystr[i]);
            }
        }
        else{
            System.out.println(0);
        }
        scan.close();
    }
}
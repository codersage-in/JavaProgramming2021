import java.io.*;
import java.util.*;

public class intTostring {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        String s1=Integer.toString(n);
        if(n==Integer.parseInt(s1)){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong Answer");
        }
    }
}

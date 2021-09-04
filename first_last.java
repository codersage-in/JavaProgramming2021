package Code_chef;
import java.util.*;
import java.lang.*;
import java.io.*;

public class first_last {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
        int a = sc.nextInt();
        int ld = a%10;
        int fd =0;
        while(a!=0)
        {
            fd = a%10;
            a = a/10;
        }
         System.out.println(fd + ld);
    }
}
}

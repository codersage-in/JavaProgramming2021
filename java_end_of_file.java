
import java.util.*;


public class java_end_of_file {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        while(scan.hasNextLine())
        {
            String s=scan.nextLine();
            System.out.println(i+" " +s);
            i++;
        }
    }
}


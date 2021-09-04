import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int count=0;
            for(int j=0;j<5;j++){
            if(scanner.nextInt()==1){
                count++;
            }
            }
            switch (count){
                case 0:
                    System.out.println("Beginner");
                    break;
                case 1:
                    System.out.println("Junior Developer");
                    break;
                case 2:
                    System.out.println("Middle Developer");
                    break;
                case 3:
                    System.out.println("Senior Developer");
                    break;
                case 4:
                    System.out.println("Hacker");
                    break;
                case 5:
                    System.out.println("Jeff Dean");
                    break;
            }
        }
    }
}

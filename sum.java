import java.util.*;


public class sum{
    public static void main (String ar[]){

        Scanner input= new Scanner(System.in);
        int noOfInput= input.nextInt();

        for(int count=0;count<noOfInput;count++){
            String data=input.next();
            int sum=0;
            for(int CharCount=0;CharCount<data.length();CharCount++){
                sum=sum+(data.charAt(CharCount)-'0');
            }
            System.out.println(sum);
        }
        input.close();
    }
}
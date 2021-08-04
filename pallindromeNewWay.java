import java.util.*;

class pallindromeNewWay {
    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            String s="", reverse="";
            s=input.nextLine();
            int length=s.length();
            for (int i=length-1; i>=0; i--) {
                reverse=reverse+s.charAt(i);
            }
            if(s.equals(reverse)){
                System.out.println("Entered string is pallindrome");
            }
            else{
                System.out.println("entered string is NOT pallindrome");
            }
            input.close();

    }    
}

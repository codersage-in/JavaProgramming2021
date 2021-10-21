import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
                       
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
        
        //Counting distinct characters
            int Count  = 1;
            for(int i=1; i<ch.length; i++){
                if(ch[i-1] != ch[i]){
                    Count++;
                }
            }
        
        //calculating and storing frequency of each char in count array
            int count[] = new int[Count];
            Arrays.fill(count,1);

            for(int i=1,j=0; i<ch.length; i++){
                if(ch[i-1] == ch[i]){
                    count[j]++;
                }
                else{
                    j++;
                }
            }
            Arrays.sort(count);

        //Determining the sum of frequency all char except char having highest frequency    
            int sum = 0;
            for(int m=0; m<Count-1; m++){
                sum += count[m];
            }

        //If sum of  frequency all char except char having highest frequency is equal then print yes
            if(sum == count[Count-1]){
                System.out.println("YES");
            }  
             //else print no
            else{
                System.out.println("NO");
            }
        }
    }
}

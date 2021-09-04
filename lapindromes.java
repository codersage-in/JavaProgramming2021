import java.util.*;

public class lapindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String sub1,sub2;
        for(int i=0;i<t;i++){
            String s=sc.next();
            int len=s.length(),val=0;
            if(len%2==0){
                sub1=s.substring(0,len/2);
                sub2=s.substring(len/2,len);
            }
            else{
                sub1=s.substring(0,len/2+1);
                sub2=s.substring(len/2,len);
            }
            char c1[]=sub1.toCharArray();
            java.util.Arrays.sort(c1);
            char c2[]=sub2.toCharArray();
            java.util.Arrays.sort(c2);
            for(int j=0;j<sub1.length();j++){
                if(c1[j]!=c2[j]){
                    val=0;
                    break;
                }
                else{
                    val=1;
                }
            }
            if(val==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
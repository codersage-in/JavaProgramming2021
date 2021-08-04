import java.util.Scanner;

public class Hello {
    public static String getSmallestAndLargest(String s, int k) {
        
        char ch[] = s.toCharArray();
        char s1[] = new char[k];
        char s2[] = new char[k];
        
        char min = ch[0],max = ch[0];
        int indexmin =0,indexmax=0;
        for(int i=1; i<s.length(); i++)
        {
            if(ch[i] < min)
            {
                min = ch[i];
                indexmin = i;
            }
            if(ch[i] > max)
            {
                max = ch[i];
                indexmax = i;
            }
        }
        for(int i=0; i<k; i++)
        {
            s1[i] = ch[indexmin + i];
            s2[i] = ch[indexmax + i]; 
        }
        // s1[k] = '\0';
        // s2[k] = '\0';
        
        String smallest = String.valueOf(s1);
        String largest = String.valueOf(s2);
        System.out.println(indexmax + " " + indexmin);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

// ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl
// sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs
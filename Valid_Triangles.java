import java.util.Scanner;
public class Valid_Triangles {
    public static void main(String arr[]){
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-- > 0)
        {
            float a = s.nextFloat();
            float b=s.nextFloat();
            float c=s.nextFloat();
            if(a+b+c == 180f)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}

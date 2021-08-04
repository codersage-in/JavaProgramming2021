import java.io.*;
public class Main {
    
    
    private static void digitSum() throws IOException
    {
        int digit,sum;
        final BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        final int t = Integer.parseInt(br.readLine());
        for(int i=0 ; i<t ;i++)
        {
            sum = 0;
            final int n = Integer.parseInt(br.readLine());
            int temp = n;
            for( ;temp>0 ; temp=temp/10)
            {
                digit = temp%10;
                sum+=digit;
            }
            
            System.out.println(sum);
        }
        
    }
    
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        digitSum();
    }
}
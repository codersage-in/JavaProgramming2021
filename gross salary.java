import java.util.*;
class CodeChef
{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            int a = s.nextInt();
            float sal;
            if(a<1500)
            {
                sal = (float)(a + (0.10*a)+(0.90*a));
            }
            else
            {
                sal = (float) (a+500+(0.98*a));
            }
            System.out.println(sal);
        }
        
    }
}
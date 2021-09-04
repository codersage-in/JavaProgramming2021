import java.util.*;
public class gross_salary 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        double basic_salary=0;
        double gross_salary=0.0;
        while(t-->0)
        {
            double hra=0.0,da=0.0;
            basic_salary=sc.nextInt();
            if(basic_salary<1500)
            {
                hra = 0.1*basic_salary;
		        da = 0.9*basic_salary;
            }
            else
            {
                hra=500;
                da=basic_salary*0.98;
            }
            gross_salary=basic_salary+hra+da;
            System.out.println(gross_salary);
        }
        sc.close();
    }
}
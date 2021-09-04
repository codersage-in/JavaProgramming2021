import java.util.*;
public class gross_salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            float salary=sc.nextFloat();
            double gross_salary=0;
            if(salary<1500){
                gross_salary=salary + 0.10*salary + 0.90*salary;
            }
            else{
                gross_salary=salary + 500 + 0.98*salary;
            }
            System.out.println(gross_salary);
        }
    }
}

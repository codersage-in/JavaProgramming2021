import java.util.*;
import java.lang.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class Gross_Salary
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner input = new Scanner(System.in);

            int N = input.nextInt();
            for(int i=0;i<N;i++){

                int basic_salary = input.nextInt();
                double HRA, DA, Gross_Salary;

                if(basic_salary < 1500){
                    HRA = basic_salary*0.1;
                    DA = basic_salary*0.9;
                    Gross_Salary = basic_salary + HRA + DA;
                    System.out.println(Gross_Salary);
                }
                else{
                    HRA = 500;
                    DA = (double)(basic_salary*98)/100;
                    Gross_Salary = basic_salary + HRA + DA;
                    System.out.println(Gross_Salary);
                }
            }
        }
    }


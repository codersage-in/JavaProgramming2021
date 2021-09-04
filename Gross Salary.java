/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int salary;
        float grossSalary;
        float HRA,DA;
        for(int i=0;i<t;i++)
        {
        salary=sc.nextInt();
        if(salary<1500)
        {
            HRA=(salary*10f)/100f;
            DA=(salary*90f)/100f;
            grossSalary=salary+HRA+DA;
            System.out.format("%.2f\n",grossSalary);
        }
        else if(salary>1500)
        {
            HRA=500;
            DA=(salary*98f)/100f;
            grossSalary=salary+HRA+DA;
            System.out.format("%.2f\n",grossSalary);
        }
        }
	}
}

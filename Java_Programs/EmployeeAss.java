//hra= 25 % of basic_salary
	//da=35% of basic_salary
	//totalsalary= hra + da + basic_salary.

import java.util.*;
class EmployeeAss
{
public static void main(String args[])
{
	int empno;
	String empname;
        int salary;
        float hra;
        float da;
        float totalsal;
 Scanner s=new Scanner(System.in);
  System.out.println("enter empno:");
  empno=s.nextInt();
   System.out.println("enter empname:");
   empname=s.next();
   System.out.println("enter salary:");
   salary=s.nextInt();
  hra=(float)salary*15/100.0f;
  da=(float)salary*35/100.0f;
  totalsal=hra+da+salary;
  
  System.out.println("hra:"+hra);
  System.out.println("da:"+da);
System.out.println("totalsal:"+totalsal);


 }
}



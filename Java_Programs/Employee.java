package mkpits1;
public class Employee
{
  int empno;
  String empname;
  int basicsal;
  float bonus;
public void insert(int en,String n,int bs)
{
    empno=en;
    empname=n;
    basicsal=bs;
   
}
public void CalculateBonus()
{
  bonus=basicsal*0.65f;
}
public void display()
{
System.out.println("empno="+empno);
System.out.println(" empname="+ empname);
System.out.println("basicsal="+basicsal);
System.out.println(" bonus="+ bonus);
}
}


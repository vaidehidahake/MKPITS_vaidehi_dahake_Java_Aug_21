import mkpits1.Employee;
import java.util.*;
public class TestEmployee
{
  public static void main(String args[])
{
   Employee e1=new Employee();
   Scanner scan=new Scanner(System.in);
   System.out.println("enter empno:");
   int empno=scan.nextInt();
   System.out.println("enter empname:");
   String empname=scan.next();
    System.out.println("enter basicsal:");
   int basicsal=scan.nextInt();
     e1.insert(empno,empname,basicsal);
     e1.CalculateBonus();
     e1.display();
}
}
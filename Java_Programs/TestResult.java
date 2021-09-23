import mkpits1.Result;
import java.util.*;
public class TestResult
{
 public static void main(String args[])
{
   Result r1=new Result();
   Scanner scan=new Scanner(System.in);
   System.out.println("enter phy marks:");
   int phy=scan.nextInt();
   System.out.println("enter chem marks:");
   int chem=scan.nextInt();
   System.out.println("enter math marks:");
   int math=scan.nextInt();
   int total=r1.CalculateTotal(phy,chem,math);
   System.out.println("total marks:"+total);
   float per=r1.CalculatePercentage();
   System.out.println("Percentage:"+per);
   String grade=r1.Grade();
   System.out.println("grade:"+grade);
}

}   
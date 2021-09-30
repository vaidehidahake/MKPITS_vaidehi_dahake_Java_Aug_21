import java.util.*;
class Student
{
int sub1,sub2,sub3;
int total;
float per;

}

Class TestAsStu
{
public static void main(String args[])
{
  Student s1=new Student();
  System.out.println("enter sub1 marks:");
  int sub1=s1.nextInt();
   System.out.println("enter sub2 marks:");
  int sub2=s1.nextInt();
   System.out.println("enter sub3 marks:");
  int sub3=s1.nextInt();
  total=sub1+sub2+sub3;
  System.out.println("total of three sub marks is:"+s1.total);
  per=(float)(total/300.0f)*100.0f;
  System.out.println("per of three sub marks is:"+s1.per);
 }
} 
  
  
  
import java.util.*;
class TypesOfVariable
{
      static int num;
     public static void main(String args[])
       {
            num=90;
            System.out.println("num="+num);
            TypesOfVariable t1=new TypesOfVariable();
             t1.num=100;
            System.out.println("number stored in t1="+t1.num);
            TypesOfVariable t2=new TypesOfVariable();
            System.out.println("number stored in t2 ="+t2.num);
       }

   }

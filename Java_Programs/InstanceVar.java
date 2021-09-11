import java.util.*;
class InstanceVar
{
      int num;
     public static void main(String args[])
       {
		   InstanceVar i1=new InstanceVar();
           i1.num=3;
        System.out.println("number stored in i1 instance="+i1.num);
        InstanceVar i2=new InstanceVar();
		           i2.num=8;
        System.out.println("number stored in i2 instance="+i2.num);
       }

   }

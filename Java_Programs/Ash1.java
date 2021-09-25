//static block
class Ash1
{ 
   static int num;
   static
   {
   System.out.println("static block is invoked");
     num=1;
   }
   public static void main(String args[])
   {
     System.out.println("Hello Main");
     System.out.println("num="+num);
     
    }
}    

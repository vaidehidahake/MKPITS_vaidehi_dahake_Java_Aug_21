//6)ex-2 StringBuffer capacity() method
class StringBufferExample16
{
 public static void main(String args[])
 {
      StringBuffer sb=new StringBuffer();
      System.out.println(sb.capacity());//16
      sb.append("hellojava");
      System.out.println(sb.capacity());//16
      sb.append("welcome to new world of java the most valuable language");
      System.out.println(sb.capacity());//64
 }
}

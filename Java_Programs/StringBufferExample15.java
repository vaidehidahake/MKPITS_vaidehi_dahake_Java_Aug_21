//6)ex-1 StringBuffer capacity() method
class StringBufferExample15
{
 public static void main(String args[])
 {
      StringBuffer sb=new StringBuffer();
      System.out.println(sb.capacity());//16
      sb.append("hello");
      System.out.println(sb.capacity());//16
      sb.append("welcome to new world of java");
      System.out.println(sb.capacity());//capacity=(16*2)+2=34.
 }
}

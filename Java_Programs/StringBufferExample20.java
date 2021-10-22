//ex-4 7) StringBuffer ensureCapacity() method
class StringBufferExample20
{
 public static void main(String args[])
 {
      StringBuffer sb=new StringBuffer();
      System.out.println(sb.capacity());//16
      sb.append("hello");
      System.out.println(sb.capacity());//16
      sb.append("java is my favourite language");
      System.out.println(sb.capacity());//34
       sb.append("java is my favourite language and it is the most valuable language");
      System.out.println(sb.capacity());//100
      sb.ensureCapacity(10);
      System.out.println(sb.capacity());//100
       sb.ensureCapacity(31);
      System.out.println(sb.capacity());//100
      sb.ensureCapacity(50);
      System.out.println(sb.capacity());//100

 }
}

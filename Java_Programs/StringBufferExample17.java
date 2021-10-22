//ex-1 7) StringBuffer ensureCapacity() method
class StringBufferExample17
{
 public static void main(String args[])
 {
      StringBuffer sb=new StringBuffer();
      System.out.println(sb.capacity());//16
      sb.append("hellojava");
      System.out.println(sb.capacity());//16
      sb.append("welcome to new world");
      System.out.println(sb.capacity());//34
      sb.ensureCapacity(10);
      System.out.println(sb.capacity());//34
      sb.ensureCapacity(50);
      System.out.println(sb.capacity());//70

 }
}

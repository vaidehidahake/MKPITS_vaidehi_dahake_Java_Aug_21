//ex-2. 7) StringBuilder ensureCapacity() method.

    class StringBuilderExample14
    {
    public static void main(String args[])
    {
    StringBuilder sb=new StringBuilder();
    System.out.println(sb.capacity());//16
    sb.append("Hello");
    System.out.println(sb.capacity());//16
    sb.append("java is my favourite language");
    System.out.println(sb.capacity());//(16*2)+2=34
    sb.ensureCapacity(10);//now no change
    System.out.println(sb.capacity());//34
    sb.ensureCapacity(50);//(34*2)+2
    System.out.println(sb.capacity());//70
     sb.ensureCapacity(60);//(34*2)+2
    System.out.println(sb.capacity());//70
    }
    }

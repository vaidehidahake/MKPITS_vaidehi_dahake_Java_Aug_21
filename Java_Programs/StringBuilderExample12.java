//ex-2. 6) StringBuilder capacity() method.
class StringBuilderExample12
{
    public static void main(String args[])
    {
    StringBuilder sb=new StringBuilder();
    System.out.println(sb.capacity());//16
    sb.append("Hello");
    System.out.println(sb.capacity());//16
    sb.append("java is my favourite language");
    System.out.println(sb.capacity());//(16*2)+2=34
    sb.append("java is my favourite language and the most used language");
    System.out.println(sb.capacity());//90
    }
    }


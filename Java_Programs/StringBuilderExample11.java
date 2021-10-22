//ex-1. 6) StringBuilder capacity() method.
class StringBuilderExample11
{  
    public static void main(String args[])
    {  
    StringBuilder sb=new StringBuilder();  
    System.out.println(sb.capacity());//16  
    sb.append("Hello");  
    System.out.println(sb.capacity());//16  
    sb.append("java is my favourite language");  
    System.out.println(sb.capacity());//now (16*2)+2=34  
    }  
    }  


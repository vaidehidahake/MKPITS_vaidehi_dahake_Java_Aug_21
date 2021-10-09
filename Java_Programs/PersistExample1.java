//Java transient Keyword.
    import java.io.*;
    class StudentEx1 implements Serializable
    {
     int id;
     String name;
     transient int age;//Now it will not be serialized
     public StudentEx1(int id, String name,int age)
     {
      this.id = id;
      this.name = name;
      this.age=age;
     }
    }
    class PersistExample1
    {
     public static void main(String args[])throws Exception
     {
     StudentEx1 s1 =new StudentEx1(213,"firoz",34);
      FileOutputStream f=new FileOutputStream("F:\\f9.txt");
      ObjectOutputStream out=new ObjectOutputStream(f);
      out.writeObject(s1);
      out.flush();
      out.close();
      f.close();
      System.out.println("success");
     }
    }

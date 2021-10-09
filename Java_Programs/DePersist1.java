import java.io.*;
    class DePersist1
    {
     public static void main(String args[])throws Exception
     {
      ObjectInputStream in=new ObjectInputStream(new FileInputStream("F:\\f9.txt"));
     StudentEx1 s=(StudentEx1)in.readObject();
      System.out.println(s.id+" "+s.name+" "+s.age);
      in.close();
     }
    }

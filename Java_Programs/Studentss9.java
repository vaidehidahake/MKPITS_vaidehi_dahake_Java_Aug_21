    import java.io.Serializable;
    public class Student9 implements Serializable
    {
     int id;
     String name;
     Address address;//HAS-A
     public Student9(int id, String name)
     {
      this.id = id;
      this.name = name;
     }
    }

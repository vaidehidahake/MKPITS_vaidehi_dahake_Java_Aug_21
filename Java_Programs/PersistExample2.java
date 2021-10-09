//example for accepting student details from user using Scanner class.
import java.io.*;
import java.util.*;
     class StudentEx3 implements Serializable
     {
     int id;
     String name;
     transient int age;//Now it will not be serialized
     public StudentEx3(int id, String name,int age) 
     {
      this.id = id;
      this.name = name;
      this.age=age;
     }
    }
    class PersistExample2
    {
     public static void main(String args[])throws Exception
     {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter student id ");
		 int id=scan.nextInt();
		  System.out.println("enter student name ");
		 String name=scan.next();
		  System.out.println("enter student age ");
		 int age=scan.nextInt();

      StudentEx3 s1 =new StudentEx3(id,name,age);
     
      FileOutputStream f=new FileOutputStream("G:\\ex.txt");
      ObjectOutputStream out=new ObjectOutputStream(f);
      out.writeObject(s1);
      out.flush();
      out.close();
      f.close();
      System.out.println("success");

      FileInputStream fos=new FileInputStream("G:\\ex.txt");
	  		ObjectInputStream oos=new ObjectInputStream(fos);
	  	StudentEx3 s11=(StudentEx3)oos.readObject(); //deserialization
	  	fos.close();
	  	System.out.println("id " + s11.id);
	  		System.out.println("name " + s11.name);
		System.out.println("age " + s11.age);


     }
    }

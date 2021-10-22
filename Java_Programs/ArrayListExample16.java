//ex-2 an example where we are storing Student class object in an array list.
import java.util.*;
class Student
{
	int rno;
	String name;
	int age;
	String course;

	Student(int rno,String name,int age,String course)
	{
		this.rno=rno;
		this.name=name;
		this.age=age;
		this.course=course;
	}
}

class ArrayListExample16
{
	public static void main(String args[])
	{
		Student s1=new Student(101,"raj",18,"Science");
		Student s2=new Student(102,"priya",20,"commerce");
		Student s3=new Student(103,"leena",22,"B.A");

		ArrayList<Student>list=new ArrayList<Student>();
		    list.add(s1);
		     list.add(s2);
		     list.add(s3);

		 Iterator itr=list.iterator();
		 while(itr.hasNext())
		 {
			 Student st=(Student)itr.next();
			 System.out.println("rno="+st.rno);
			 System.out.println("name="+st.name);
			 System.out.println("age="+st.age);
			 System.out.println("course="+st.course);
	     }

    }

}



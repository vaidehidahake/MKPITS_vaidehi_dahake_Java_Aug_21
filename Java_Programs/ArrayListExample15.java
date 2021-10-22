//ex-1 an example where we are storing Student class object in an array list.
import java.util.*;
class Student
{
	int rno;
	String name;
	int age;

	Student(int rno,String name,int age)
	{
		this.rno=rno;
		this.name=name;
		this.age=age;
	}
}

class ArrayListExample15
{
	public static void main(String args[])
	{
		Student s1=new Student(101,"raj",13);
		Student s2=new Student(102,"priya",20);
		Student s3=new Student(103,"leena",34);

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
	     }

    }

}



import java.io.Serializable;
import java.io.*;
 class Address implements Serializable
 {
     String addressLine,city,state;
     public Address(String addressLine, String city, String state)
     {
      this.addressLine=addressLine;
      this.city=city;
      this.state=state;
     }
    }

  class StudentsA implements Serializable
  {
     int id;
     String name;
     Address address;//HAS-A
     public StudentsA(int id, String name,Address address)
     {
      this.id = id;
      this.name = name;
      this.address=address;
     }
     public static void main(String[] arg)
     {
	 		try
	 		{
				Address addr=new Address("indorachowk","nagpur","maharastra");
	 		StudentsA s1=new StudentsA(101,"ramila",addr);
	 		FileOutputStream fos=new FileOutputStream("e://stud1.txt");
	 		ObjectOutputStream oos=new ObjectOutputStream(fos);
	 		oos.writeObject(s1); //serialization
	 		oos.flush();
	 		fos.close();
	 		System.out.println("success");
	 	}
	 	catch(Exception ee)
	 	{
	 		System.out.println(ee.toString() );
	 	}


	 	try
				{

				FileInputStream fos=new FileInputStream("e://stud1.txt");
				ObjectInputStream oos=new ObjectInputStream(fos);
			StudentsA s1=(StudentsA)oos.readObject(); //deserialization

				fos.close();
				System.out.println("student id " + s1.id);
				System.out.println("student name " + s1.name);
				System.out.println("address line " + s1.address.addressLine);
				System.out.println("city " + s1.address.city);
					System.out.println("state " + s1.address.state);
			}
			catch(Exception ee)
			{
				System.out.println(ee.toString() );
	}

	}

    }

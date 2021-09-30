//Assign and print the roll_number, phone_number and address of two students having names "Sam" and "John"
//respectively by creating two objects of class 'Student'.
class Students
{
  String name;
  int roll_number;
  long phone_number;
  String address;
  void display()
  {
  System.out.println("name="+name);
  System.out.println("roll_number="+roll_number);
  System.out.println("phone_number="+phone_number);
  System.out.println("address="+address);
  }

 }
 class TestSStudents
 {
  public static void main(String args[])
  {
   Students s1=new Students();
   s1.name="Sam";
   s1.roll_number=11;
   s1.phone_number=66764657748l;
   s1.address="nagpur";
   s1.display();

   Students s2=new Students();
      s2.name="John";
      s2.roll_number=12;
      s2.phone_number=35646377372l;
      s2.address="raipur";
      s2.display();
    }
 }
